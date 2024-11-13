package com.planisense.test.mapper;

import com.planisense.test.dto.TreeDto;
import com.planisense.test.entity.Tree;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface TreeMapper {
    TreeDto toDto(Tree tree);
    List<TreeDto> toDtos(List<Tree> tree);

}
