import Vue from 'vue';
import VueRouter from 'vue-router';

import Index from '@/views/Index.vue';
import PlayChannel from '@/views/channel/play.vue';
import Login from '@/views/Login.vue';
import Course from '@/views/course/index.vue';
import Request from '@/views/course/Request.vue';
import RequestDetail from '@/views/course/RequestDetail.vue';
import EditCourse from '@/views/course/Edit.vue';
import EditLoadMap from '@/views/loadmap/Edit.vue';

import EditVideo from '@/views/channel/EditVideo.vue';

import Channel from '@/views/channel/Channel.vue';
import Mypage from '@/views/Mypage.vue';
import VideoUpload from '@/views/video/Upload.vue';
import CourseList from '@/views/course/CourseList.vue';
import LoadmapList from '@/views/loadmap/LoadmapList.vue';
import VideoList from '@/views/video/VideoList.vue';
Vue.use(VueRouter);

const routes = [
	{
		path: '/',
		name: 'Index',
		component: Index,
	},
	{
		path: '/channel/play',
		name: 'PlayChannel',
		component: PlayChannel,
	},
	{
		path: '/channel/edit',
		name: 'EditVideo',
		component: EditVideo,
	},
	{
		path: '/login',
		name: 'Login',
		component: Login,
	},
	{
		path: '/course/:no/:id',
		name: 'Course',
		component: Course,
	},
	{
		path: '/course',
		name: 'CourseList',
		component: CourseList,
	},
	{
		path: '/roadmap',
		name: 'LoadmapList',
		component: LoadmapList,
	},
	{
		path: '/video',
		name: 'VideoList',
		component: VideoList,
	},
	{
		path: '/request',
		name: 'Request',
		component: Request,
	},
	{
		path: '/request/:id',
		name: 'RequestDetail',
		component: RequestDetail,
	},
	{
		path: '/course/management/:id',
		name: 'EditCourse',
		component: EditCourse,
	},
	{
		path: '/loadmap/management/:id',
		name: 'EditLoadMap',
		component: EditLoadMap,
	},
	{
		path: '/channel/:id',
		name: 'Channel',
		component: Channel,
	},
	{
		path: '/mypage',
		name: 'Mypage',
		component: Mypage,
	},
	{
		path: '/video/upload',
		name: 'VideoUpload',
		component: VideoUpload,
	},
	{
		path: '/video/edit',
		name: 'VideoUpload',
		component: VideoUpload,
	},
];

const router = new VueRouter({
	mode: 'history',
	// base: process.env.BASE_URL,
	routes,
});

export default router;
