/**
 * @author	: Rajiv Kumar
 * @project	: code-snipper
 */

package com.github.ecominds;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

public class JavaUtil {
	private HashMap<Integer, List<PostInfo>> load(File dataConfigFile) {
		try {
			Type customType = new TypeToken<Map<Integer, List<PostInfo>>>() {
			}.getType();
			return new Gson().fromJson(new BufferedReader(new FileReader(dataConfigFile)), customType);
		} catch (Exception e) {
			throw new NullPointerException(e.getMessage());
		}
	}

	protected void persist(File dataConfigFile, Map<Integer, List<PostInfo>> col) {
		System.out.println("Persisting...");
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		String jsonString = gson.toJson(col);

		try (BufferedWriter writer = new BufferedWriter(new FileWriter(dataConfigFile))) {
			writer.write(jsonString);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	static class PostInfo{}
}