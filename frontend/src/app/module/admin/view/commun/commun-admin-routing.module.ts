
// const root = environment.rootAppUrl;

import { NgModule } from '@angular/core';
import { RouterModule } from '@angular/router';
import { AuthGuard } from 'src/app/controller/guards/auth.guard';



import { ProductListAdminComponent } from './product-admin/list-admin/product-list-admin.component';
import { ClientCategoryListAdminComponent } from './client-category-admin/list-admin/client-category-list-admin.component';
import { ClientListAdminComponent } from './client-admin/list-admin/client-list-admin.component';
@NgModule({
    imports: [
        RouterModule.forChild(
            [
                {
                    path: '',
                    children: [


                        {

                            path: 'product',
                            children: [
                                {
                                    path: 'list',
                                    component: ProductListAdminComponent ,
                                    canActivate: [AuthGuard]
                                }
                            ]
                        },

                        {

                            path: 'client-category',
                            children: [
                                {
                                    path: 'list',
                                    component: ClientCategoryListAdminComponent ,
                                    canActivate: [AuthGuard]
                                }
                            ]
                        },

                        {

                            path: 'client',
                            children: [
                                {
                                    path: 'list',
                                    component: ClientListAdminComponent ,
                                    canActivate: [AuthGuard]
                                }
                            ]
                        },

                    ]
                },
            ]
        ),
    ],
    exports: [RouterModule],
})
export class CommunAdminRoutingModule { }
