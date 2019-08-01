import { HttpHeaders } from '@angular/common/http';
import { environment } from './../../environments/environment';

const API_PREFIX = 'api';
const API_VERSION = 'V1';

export function getApiBaseUrl(seervicePrefix: string): string {
	return `${environment.apiUrl}/${seervicePrefix}/${API_PREFIX}/${API_VERSION}`;
}

export const HTTP_OPTIONS = {
	headers: new HttpHeaders({ 'Content-Type': 'application/json' }),
	withCredentials: true
};

export const HTTP_OPTIONS_MULTIPART = {
	withCredentials: true
};
