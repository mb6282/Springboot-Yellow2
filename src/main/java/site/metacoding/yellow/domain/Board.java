package site.metacoding.yellow.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
//All만들거면 No도 만들어야 함
@Setter
@Getter
public class Board {
	private Integer id;
	private String title;
	private String content;
}