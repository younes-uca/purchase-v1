import { NgModule } from '@angular/core';
import { RouterModule } from '@angular/router';
import { AppMainComponent } from './app.main.component';
import { AuthGuard } from './controller/guards/auth.guard';
import { AccessDeniedComponent } from './auth/access-denied/access-denied.component';
import {HomeComponent} from './module/home/home.component';

import {LoginAdminComponent} from './module/admin/login-admin/login-admin.component';
import {RegisterAdminComponent} from './module/admin/register-admin/register-admin.component';
import {LoginAgentComponent} from './module/agent/login-agent/login-agent.component';
import {RegisterAgentComponent} from './module/agent/register-agent/register-agent.component';
@NgModule({
  imports: [
    RouterModule.forRoot(
      [
          { path: '', component: HomeComponent },
        {path: 'admin/login', component: LoginAdminComponent },
        {path: 'admin/register', component: RegisterAdminComponent },
        {path: 'agent/login', component: LoginAgentComponent },
        {path: 'agent/register', component: RegisterAgentComponent },
         {
          path: 'app', // '\'' + root + '\'',
          component: AppMainComponent,
          children: [
            {
              path: 'admin',
              loadChildren: () => import( './module/admin/admin-routing.module').then(x => x.AdminRoutingModule),
              canActivate: [AuthGuard],
            },
            {
              path: 'agent',
              loadChildren: () => import( './module/agent/agent-routing.module').then(x => x.AgentRoutingModule),
              canActivate: [AuthGuard],
            },
            { path: 'denied', component: AccessDeniedComponent },
          ],
          canActivate: [AuthGuard]
        },
      ],
      { scrollPositionRestoration: 'enabled' }
    ),
  ],
  exports: [RouterModule],
})
export class AppRoutingModule { }