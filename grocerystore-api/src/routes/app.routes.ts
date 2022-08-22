import { Router } from 'express';

import AuthController from '../controllers/AuthController';
import UserController from '../controllers/UserController';
import OrderController from '../controllers/OrderController';

import verifyAuth from '../middlewares/verifyAuth';

const routes = Router();

routes.post('/auth/signin', AuthController.signIn);
routes.post('/auth/signup', AuthController.signUp);

routes.get('/users', verifyAuth, UserController.show);
routes.patch('/users', verifyAuth, UserController.update);
routes.delete('/users', verifyAuth, UserController.destroy);

routes.get('/orders', verifyAuth, OrderController.index);
routes.post('/orders', verifyAuth, OrderController.store);

export default routes;
