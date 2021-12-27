package rest;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
@Service
public class ZipService {
	ZipInfo detail;
	public List<ZipInfo> getList(){
		List<ZipInfo> list=new ArrayList<>();
		list.add(new ZipInfo("Kolhapur","Maharashtra","Dattawad","416107"));
		list.add(new ZipInfo("Satara","Maharashtra","Satara_Town","424860"));
		list.add(new ZipInfo("Pune","Maharashtra","Pune","426789"));
		list.add(new ZipInfo("Mumbai","Maharashtra","Thane","431892"));
		list.add(new ZipInfo("Banglore","Karnataka","M.G","560001"));
		/*
		 * list.add(new ZipInfo("Kolhapur","Maharashtra","Dattawad","416107"));
		 * list.add(new ZipInfo("Kolhapur","Maharashtra","Dattawad","416107"));
		 * list.add(new ZipInfo("Kolhapur","Maharashtra","Dattawad","416107"));
		 * list.add(new ZipInfo("Kolhapur","Maharashtra","Dattawad","416107"));
		 * list.add(new ZipInfo("Kolhapur","Maharashtra","Dattawad","416107"));
		 */
		return list;
	}
	public ZipInfo display(String zipcode) {
		List<ZipInfo> zipInfos=getList();
		for(int i=0;i<zipInfos.size();i++) {
			if(zipcode.equals(zipInfos.get(i).getZipcode())) {
				detail=zipInfos.get(i);
			}
		}
		return detail;
	}
}
