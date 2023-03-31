package model;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

public class SalesParser {
	public List<Sales> getList(String path) {
		List<Sales> list = new ArrayList<>();
		BufferedReader br = null;
		try {
			FileInputStream fis = new FileInputStream(path);
			InputStreamReader isr = new InputStreamReader(fis, "UTF-8");
			br = new BufferedReader(isr);
			String line;
			while ((line = br.readLine()) != null) {
				if (line.startsWith("年度")) {
					continue;
				}
				/*
				 splitの第二引数は分割数、ここに負の値を設定すると最後の部分が空白でも空白文字列として配列を作る
				 例)
				 String csv="hoge,fuga,,bar,,";
				 String[] data=csv.split(",",-1);
				 結果)data[0]="hoge",data[1]="fuga",data[2]="",data[3]="bar",data[4]="",data[5]=""
				 */
				String[] data = line.split(",", -1);
				String year = data[0];
				String salesA = data[1];
				String salesB = data[2];
				Sales sales = new Sales(year, salesA, salesB);

				list.add(sales);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (br != null) {
				try {
					br.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		return list;
	}
}