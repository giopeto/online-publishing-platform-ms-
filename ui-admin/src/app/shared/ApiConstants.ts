import { HttpHeaders } from '@angular/common/http';

const API_HOST = 'http://localhost:8080';
const API_PREFIX = 'api';
const API_VERSION = 'V1';

export const API_BASE_URL = `${API_HOST}/${API_PREFIX}/${API_VERSION}`;

export const HTTP_OPTIONS = {
	headers: new HttpHeaders({ 'Content-Type': 'application/json' }),
	withCredentials: true
};

export const HTTP_OPTIONS_MULTIPART = {
	withCredentials: true
};
