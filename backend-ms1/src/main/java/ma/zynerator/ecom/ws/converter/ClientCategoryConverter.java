package  ma.zynerator.ecom.ws.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import ma.zynerator.ecom.zynerator.util.StringUtil;
import ma.zynerator.ecom.zynerator.converter.AbstractConverter;
import ma.zynerator.ecom.zynerator.util.DateUtil;
import ma.zynerator.ecom.bean.history.ClientCategoryHistory;
import ma.zynerator.ecom.bean.core.ClientCategory;
import ma.zynerator.ecom.ws.dto.ClientCategoryDto;

@Component
public class ClientCategoryConverter extends AbstractConverter<ClientCategory, ClientCategoryDto, ClientCategoryHistory> {


    public  ClientCategoryConverter(){
        super(ClientCategory.class, ClientCategoryDto.class, ClientCategoryHistory.class);
    }

    @Override
    public ClientCategory toItem(ClientCategoryDto dto) {
        if (dto == null) {
            return null;
        } else {
        ClientCategory item = new ClientCategory();
            if(StringUtil.isNotEmpty(dto.getId()))
                item.setId(dto.getId());
            if(StringUtil.isNotEmpty(dto.getLabel()))
                item.setLabel(dto.getLabel());
            if(StringUtil.isNotEmpty(dto.getReference()))
                item.setReference(dto.getReference());


        return item;
        }
    }

    @Override
    public ClientCategoryDto toDto(ClientCategory item) {
        if (item == null) {
            return null;
        } else {
            ClientCategoryDto dto = new ClientCategoryDto();
            if(StringUtil.isNotEmpty(item.getId()))
                dto.setId(item.getId());
            if(StringUtil.isNotEmpty(item.getLabel()))
                dto.setLabel(item.getLabel());
            if(StringUtil.isNotEmpty(item.getReference()))
                dto.setReference(item.getReference());


        return dto;
        }
    }


    public void initObject(boolean value) {
    }


}
