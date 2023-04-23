import {BaseDto} from 'src/app/zynerator/dto/BaseDto.model';


export class ProductDto  extends BaseDto{

    public id: number;
    public reference: string;
    public label: string;

}
