import {BaseCriteria} from 'src/app/zynerator/criteria/BaseCriteria.model';


export class ProductCriteria  extends   BaseCriteria  {

    public id: number;
    public reference: string;
    public referenceLike: string;
    public label: string;
    public labelLike: string;

}
