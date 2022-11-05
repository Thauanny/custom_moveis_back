package com.customMoveis.model.dto;

import java.util.List;
import com.customMoveis.model.movel.Movel;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class LojistaDTO {
	private Integer lojista_id;
	private String username;
	private String password;
    private List<Movel> moveis;
    private String email;
}