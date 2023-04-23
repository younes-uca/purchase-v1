
// const root = environment.rootAppUrl;

import { NgModule } from '@angular/core';
import { RouterModule } from '@angular/router';
import { AuthGuard } from 'src/app/controller/guards/auth.guard';

import { LoginAgentComponent } from './login-agent/login-agent.component';
import { RegisterAgentComponent } from './register-agent/register-agent.component';

@NgModule({
    imports: [
        RouterModule.forChild(
            [
                {
                    path: '',
                    children: [
                        {
                            path: 'login',
                            children: [
                                {
                                    path: '',
                                    component: LoginAgentComponent ,
                                    canActivate: [AuthGuard]
                                }
                              ]
                        },
                        {
                            path: 'register',
                            children: [
                                {
                                    path: '',
                                    component: RegisterAgentComponent ,
                                    canActivate: [AuthGuard]
                                }
                              ]
                        },
                        {

                            path: 'purchase',
                            loadChildren: () => import('./view/purchase/purchase-agent-routing.module').then(x=>x.PurchaseAgentRoutingModule),
                            canActivate: [AuthGuard],
                        },
                        {

                            path: 'commun',
                            loadChildren: () => import('./view/commun/commun-agent-routing.module').then(x=>x.CommunAgentRoutingModule),
                            canActivate: [AuthGuard],
                        },
                    ]
                },
            ]
        ),
    ],
    exports: [RouterModule],
})
export class AgentRoutingModule { }
