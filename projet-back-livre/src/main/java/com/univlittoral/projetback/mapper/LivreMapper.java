package com.univlittoral.projetback.mapper;

import java.util.ArrayList;
import java.util.List;


import com.univlittoral.projetback.dto.LivreDTO;
import com.univlittoral.projetback.entity.LivreEntity;

public class LivreMapper {

	public static LivreDTO map(LivreEntity entity) {
		
		LivreDTO livre = new LivreDTO();
		
		livre.setDateParution(entity.getDateParution());
		livre.setEditeur(entity.getEditeur());
		livre.setGenre(entity.getGenre());
		livre.setId(entity.getId());
		livre.setLieuParution(entity.getLieuParution());
		livre.setNbPages(entity.getNbPages());
		livre.setNom(entity.getNom());
		
		
		return livre;
			
	}
	
	public static List<LivreDTO> map(List<LivreEntity> livresEntities){
		
		List<LivreDTO> result = new ArrayList<LivreDTO>();
		
		for(final LivreEntity entity : livresEntities) {
			result.add(LivreMapper.map(entity));
		}
		
		return result;
			
		
	}
	
	  public static LivreEntity mapEntityToEntity(LivreEntity myEntity, LivreDTO lrs) { 
	        
	        myEntity.setId (lrs.getId());
	        myEntity.setNom (lrs.getNom());
	        myEntity.setEditeur (lrs.getEditeur());
	        myEntity.setNbPages (lrs.getNbPages());
	        myEntity.setDateParution (lrs.getDateParution());
	        myEntity.setLieuParution (lrs.getLieuParution());
	        myEntity.setGenre (lrs.getGenre());
	        

	        return myEntity;
	        
	  
	  }

	public static LivreEntity mapDTOtoEntity(LivreDTO livre) {
		LivreEntity livreEntity = new LivreEntity();
		
		livreEntity.setDateParution(livre.getDateParution());
		livreEntity.setEditeur(livre.getEditeur());
		livreEntity.setGenre(livre.getGenre());
		livreEntity.setId(livre.getId());
		livreEntity.setLieuParution(livre.getLieuParution());
		livreEntity.setNbPages(livre.getNbPages());
		livreEntity.setNom(livre.getNom());
		
		
		return livreEntity;
	}
		
		
			
		
	}
	

