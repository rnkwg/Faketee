package com.konai.kurong.faketee.draft.dto;

import lombok.Builder;
import lombok.Getter;

import javax.validation.constraints.NotNull;

@Getter
@Builder
public class DraftCancelRequestDto {
    @NotNull
    private Long draftId;
}
