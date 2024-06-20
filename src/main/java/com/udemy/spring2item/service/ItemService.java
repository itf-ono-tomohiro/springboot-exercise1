package com.udemy.spring2item.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.udemy.spring2item.model.Item;

@Service
public class ItemService {
	
	private List<Item> allItems = new ArrayList<> (Arrays.asList(
			new Item("1001","ネックレス","ジュエリ"),
			new Item("1002","パーカー","ファッション"),
			new Item("1003","フェイスクリーム","ビューティ"),
			new Item("1004","サプリメント","ヘルス"),
			new Item("1005","ブルーベリー","フード")));
	
	public List<Item> getAllItems(){
		return allItems;
	}
	
	public Item getItem(String itemId) {
		for(int i = 0; i <allItems.size(); i++) {
			if(allItems.get(i).getItemId().equals(itemId)) {
				return (Item)allItems.get(i);
			}
		}
		return null;
	}
	
	public void addItem(Item item) {
		allItems.add(item);
	}
	
	public void updateItem(String itemId, Item item) {
		for(int i = 0; i < allItems.size();i++) {
			if(allItems.get(i).getItemId().equals(itemId))
				allItems.set(i, item);
		}
	}
	
	public void deleteItem(String itemId) {
		allItems.removeIf(i -> i.getItemId().equals(itemId));
	}

}
