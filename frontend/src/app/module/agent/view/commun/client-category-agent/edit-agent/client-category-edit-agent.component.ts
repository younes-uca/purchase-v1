import {Component, OnInit, Input} from '@angular/core';

import {ConfirmationService, MessageService} from 'primeng/api';
import {Router} from '@angular/router';
import {MenuItem} from 'primeng/api';
import { environment } from 'src/environments/environment';
import {DatePipe} from '@angular/common';

import {AbstractEditController} from 'src/app/zynerator/controller/AbstractEditController';
import {RoleService} from 'src/app/zynerator/security/Role.service';
import {StringUtilService} from 'src/app/zynerator/util/StringUtil.service';

import {ClientCategoryService} from 'src/app/controller/service/ClientCategory.service';
import {ClientCategoryDto} from 'src/app/controller/model/ClientCategory.model';
import {ClientCategoryCriteria} from 'src/app/controller/criteria/ClientCategoryCriteria.model';



@Component({
  selector: 'app-client-category-edit-agent',
  templateUrl: './client-category-edit-agent.component.html'
})
export class ClientCategoryEditAgentComponent extends AbstractEditController<ClientCategoryDto, ClientCategoryCriteria, ClientCategoryService>   implements OnInit {


    private _validClientCategoryLabel = true;
    private _validClientCategoryReference = true;




    constructor(private datePipe: DatePipe, private clientCategoryService: ClientCategoryService
        , private stringUtilService: StringUtilService, private roleService: RoleService,  private messageService: MessageService
        , private confirmationService: ConfirmationService, private router: Router  

    ) {
        super(datePipe, clientCategoryService, messageService, confirmationService, roleService, router, stringUtilService);
    }

    ngOnInit(): void {
}

    public setValidation(value : boolean){
        this.validClientCategoryLabel = value;
        this.validClientCategoryReference = value;
        }
    public validateForm(): void{
        this.errorMessages = new Array<string>();
        this.validateClientCategoryLabel();
        this.validateClientCategoryReference();
    }
    public validateClientCategoryLabel(){
        if (this.stringUtilService.isEmpty(this.item.label)) {
            this.errorMessages.push('Label non valide');
            this.validClientCategoryLabel = false;
        } else {
            this.validClientCategoryLabel = true;
        }
    }
    public validateClientCategoryReference(){
        if (this.stringUtilService.isEmpty(this.item.reference)) {
            this.errorMessages.push('Reference non valide');
            this.validClientCategoryReference = false;
        } else {
            this.validClientCategoryReference = true;
        }
    }






    get validClientCategoryLabel(): boolean {
        return this._validClientCategoryLabel;
    }
    set validClientCategoryLabel(value: boolean) {
        this._validClientCategoryLabel = value;
    }
    get validClientCategoryReference(): boolean {
        return this._validClientCategoryReference;
    }
    set validClientCategoryReference(value: boolean) {
        this._validClientCategoryReference = value;
    }

}
