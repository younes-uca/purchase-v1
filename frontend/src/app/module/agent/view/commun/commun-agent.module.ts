import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import {ToastModule} from 'primeng/toast';
import {ToolbarModule} from 'primeng/toolbar';
import {TableModule} from 'primeng/table';
import {DropdownModule} from 'primeng/dropdown';
import {InputSwitchModule} from 'primeng/inputswitch';
import {InputTextareaModule} from 'primeng/inputtextarea';

import { ConfirmDialogModule } from 'primeng/confirmdialog';
import { DialogModule } from 'primeng/dialog';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import {CalendarModule} from 'primeng/calendar';
import {PanelModule} from 'primeng/panel';
import {InputNumberModule} from 'primeng/inputnumber';
import {BadgeModule} from 'primeng/badge';
import { MultiSelectModule } from 'primeng/multiselect';
import {TranslateModule} from '@ngx-translate/core';

import { ProductCreateAgentComponent } from './product-agent/create-agent/product-create-agent.component';
import { ProductEditAgentComponent } from './product-agent/edit-agent/product-edit-agent.component';
import { ProductViewAgentComponent } from './product-agent/view-agent/product-view-agent.component';
import { ProductListAgentComponent } from './product-agent/list-agent/product-list-agent.component';
import { ClientCategoryCreateAgentComponent } from './client-category-agent/create-agent/client-category-create-agent.component';
import { ClientCategoryEditAgentComponent } from './client-category-agent/edit-agent/client-category-edit-agent.component';
import { ClientCategoryViewAgentComponent } from './client-category-agent/view-agent/client-category-view-agent.component';
import { ClientCategoryListAgentComponent } from './client-category-agent/list-agent/client-category-list-agent.component';
import { ClientCreateAgentComponent } from './client-agent/create-agent/client-create-agent.component';
import { ClientEditAgentComponent } from './client-agent/edit-agent/client-edit-agent.component';
import { ClientViewAgentComponent } from './client-agent/view-agent/client-view-agent.component';
import { ClientListAgentComponent } from './client-agent/list-agent/client-list-agent.component';

import { PasswordModule } from 'primeng/password';
import { InputTextModule } from 'primeng/inputtext';
import {ButtonModule} from 'primeng/button';
import {FormsModule, ReactiveFormsModule} from '@angular/forms';
import {RouterModule} from '@angular/router';
import {TabViewModule} from 'primeng/tabview';
import { SplitButtonModule } from 'primeng/splitbutton';
import { MessageModule } from 'primeng/message';
import {MessagesModule} from 'primeng/messages';
import {PaginatorModule} from 'primeng/paginator';



@NgModule({
  declarations: [

    ProductCreateAgentComponent,
    ProductListAgentComponent,
    ProductViewAgentComponent,
    ProductEditAgentComponent,
    ClientCategoryCreateAgentComponent,
    ClientCategoryListAgentComponent,
    ClientCategoryViewAgentComponent,
    ClientCategoryEditAgentComponent,
    ClientCreateAgentComponent,
    ClientListAgentComponent,
    ClientViewAgentComponent,
    ClientEditAgentComponent,
  ],
  imports: [
    CommonModule,
    ToastModule,
    ToolbarModule,
    TableModule,
    ConfirmDialogModule,
    DialogModule,
    PasswordModule,
    InputTextModule,
    ButtonModule,
    FormsModule,
    ReactiveFormsModule,
    RouterModule,
    SplitButtonModule,
    BrowserAnimationsModule,
    DropdownModule,
    TabViewModule,
    InputSwitchModule,
    InputTextareaModule,
    CalendarModule,
    PanelModule,
    MessageModule,
    MessagesModule,
    InputNumberModule,
    BadgeModule,
    MultiSelectModule,
    PaginatorModule,
    TranslateModule,
  ],
  exports: [
  ProductCreateAgentComponent,
  ProductListAgentComponent,
  ProductViewAgentComponent,
  ProductEditAgentComponent,
  ClientCategoryCreateAgentComponent,
  ClientCategoryListAgentComponent,
  ClientCategoryViewAgentComponent,
  ClientCategoryEditAgentComponent,
  ClientCreateAgentComponent,
  ClientListAgentComponent,
  ClientViewAgentComponent,
  ClientEditAgentComponent,
  ],
  entryComponents: [],
})
export class CommunAgentModule { }