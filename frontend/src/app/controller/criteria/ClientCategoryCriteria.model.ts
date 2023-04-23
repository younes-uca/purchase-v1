import {BaseCriteria} from 'src/app/zynerator/criteria/BaseCriteria.model';


export class ClientCategoryCriteria  extends   BaseCriteria  {

    public id: number;
    public label: string;
    public labelLike: string;
    public reference: string;
    public referenceLike: string;

}
