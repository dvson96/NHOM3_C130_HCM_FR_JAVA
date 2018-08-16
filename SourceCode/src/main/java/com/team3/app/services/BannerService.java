package com.team3.app.services;

import org.springframework.stereotype.Service;

import com.team3.app.entities.Banner;
import com.team3.app.utils.HttpObject;

public interface BannerService {
	Object getAll();
	Object insertOne(Banner banner);
	Object deleteOne(int id);
	Object editOne(Banner banner);
}
