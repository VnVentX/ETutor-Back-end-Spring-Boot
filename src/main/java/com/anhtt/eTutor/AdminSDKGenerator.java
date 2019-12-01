package com.anhtt.eTutor;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.Serializable;
import java.util.Base64;

public class AdminSDKGenerator implements Serializable {

	public static InputStream getAdminSDKInputStream() {
		Base64.Decoder dec = Base64.getDecoder();
		byte[] byteArr = dec.decode(ADMIN_SDK_BASE64);
		InputStream result = new ByteArrayInputStream(byteArr);
		
		return result;
	}

	private static final String ADMIN_SDK_BASE64 = "ewogICJ0eXBlIjogInNlcnZpY2VfYWNjb3VudCIsCiAgInByb2plY3RfaWQiOiAiZXR1dG9yLWFwcC1lYjA4OSIsCiAgInByaXZhdGVfa2V5X2lkIjogImRjNmM2ZTkxZDhmMjg4MGMwNzQ5YjhkZDdlN2NjYmNlNDNjOWNkMjgiLAogICJwcml2YXRlX2tleSI6ICItLS0tLUJFR0lOIFBSSVZBVEUgS0VZLS0tLS1cbk1JSUV2Z0lCQURBTkJna3Foa2lHOXcwQkFRRUZBQVNDQktnd2dnU2tBZ0VBQW9JQkFRQ2x6MW5RR2pEamI5TTdcbmlaTkRMVVI1dHdmYVFkcFJrM2VaQ21NT3E2ZHdHbFMydXY0Z1dLSWx1WEV4TFVoOXFuekg2bWw1NFNESHI1Y2Zcbm9zTjNoL1I0NmV1T0NFbk4vNndyWVY3VVdFdTF4dXBkNmlzZTBQR09tRHN5TGNDRGI1VUxIY21xejdsUmZLZTZcbk9aK29xZkY1M3hrd2MyK2U3MHVGM2xReWJMazJzTVZUYzlTTTJmUnBDOHF0MklCMXpWMVo2T3QydnZ4NU5DWkNcbitmZWRjMUs5NlNPT1pkbUdjejFMZ0Z6SVJOVXQ0MTF2ZmRDM1pXTm1JSVNtNmRJYXJERHJvVmcwR2RUdXRZWG9cbkxSdlpZc1ZITkpxcHRoWS9sWEJTMVlRWDBZT2hzbTV1ZmIxamgxdEpNTHF1YzFhVC91SitNQU1lV0J1ZU1MYTFcbjhKdkxQeDZSQWdNQkFBRUNnZ0VBRFVabm0yaXRaMWdwb2tlbWVhZGpKeGVIVW1zWlRwU3U2NXJRU1hsbXcydm9cblFtVUFPWmkvQ3FRcE10VzhTd3RlU0NjMVlLT3NtekFzdWtTdXY2QXI2NDVXNUowM1EzM255K1ZVMFUxc2FsWk5cbnAwMDdQSkZmOVptc2k1enNIOW5NSmdLeGhiSngxTnRWRm16TW9wVlFsd0JNcFB0cEFXR0pPMk9NZkNrR1B5R1FcbjBodCtwSTJsUGJ2dFZYQWhWMGxMVUhSTG54aFU2Z3JETERnSitlRWhGdTBHQ1V1Q2tIbkx0RlpnZkJ5RFlBeWlcbmpUS0VFUFNYRTViQXlDZko5akNLUWdHeHB3WHNraHJGYlUrYmtjVCt0RTc3RktBUGlRMWNyUStVTVpYRjV2M3NcbkVkMEUwM0MwQWpPUGwrZVFWd0V1dGlsalZ4QmI1aVJmZTVRQ3B5eExrUUtCZ1FEajg2SlYyZDE0TFFqRWdnZUpcbjRWVXVLa3I1YWxlMktNMU1xRHg5WlJVRVh2dExrRTBiRUFUYnZMMDlkVzhIOU9NNmhQbHFqSVVGUXN6TUtXdDFcbnpYR1ViVFREblFzUVZwa0FlaVc3UWhyWmVnSUoxb0lqRnRVMTRrNFIwUmNMY0lVc2wxZ3ZWUTFTVU12R3NONTNcbm4xQk9uekZaWk1xTVpocU1pOXdEMlU5UW5RS0JnUUM2Tmtob1psOUxiUllNZnZydTVrN0lBZ1IvZUpLWmUzKzRcbjZvekdsSWJ6RlJySDdOamlrVmgzTnIzUUhTcWZrNmJGNGRSTnpHTXI3TERYbjEvbzlyTS9JZDlOUmZEaEx3QmtcbmNhTTN2RWpzTFZRcHM5OThwSzZVWXlYenRTUXNWZUFSbVFoeFRBWUtNZGRIRG8xOTRwcXZhNmFmS2djeHRxSk9cbnFWbFR1bDRoaFFLQmdRQ2JVQXZDYk4vZUd1a0hZd1VaNThMdTRuZ1UrbVRxdzJBbUk5YWJKWDB0YmozUUhYQzdcbnlLMVd2b0U5MTc2ZjhEWEdVSVhVR0F3bUtuNTVlSnMwTjVkMHB2ZTFkRkh1ZnVKZWxkc1JmSmZvcDUydDhFN1lcbjg1eXZ5eEtnUnhOcGd1L3FFdkJOeDZoODlubnhWZDh1S0FsQ21HcTZXdGM2MC9LdzRqWTFGU0phYlFLQmdITVJcbmJEa25XYWZRWnhtZHRnNit2dHdWY3hZYU9lMGlSZERORCtUK2owM1RNdE5zWnJITFF6R1g0RCtrWmx4cDcxckVcbnJGN08rRkdDVjkxR25Rdm10dWxDVXl6N0ZWanhwSHB0Um9FQWxzZHJVMkRaeURiTHhSM3BEdURFaE8vb3VTZm1cbnV6TFgyYnVmQlByaDRVbHpLRWRTYklwYWZFdWFJajRkcEJkN1NRUEpBb0dCQUt3ekxIMldXaXI3d0tQTHJaaHRcbjdEQmhvMVhlQzZ1RHhPelZjang5QzIrVjNwemdVZlhnWVdhZDdlazIwaG04N1JEYUNvVFlLRWFGUVBGRzN3VlBcbkY2RUdpRGkvYmw3MzFBa29RWEtEaUwraTJtR0JmbjFwSEVHM3JJd2ZDRVNWZEh3Y2hUMDdza1Eyd0tIRzVsNlpcbko1WTd2UjQvUnFTbWhHMmp2V24vZWtZNlxuLS0tLS1FTkQgUFJJVkFURSBLRVktLS0tLVxuIiwKICAiY2xpZW50X2VtYWlsIjogImZpcmViYXNlLWFkbWluc2RrLXhlZGo1QGV0dXRvci1hcHAtZWIwODkuaWFtLmdzZXJ2aWNlYWNjb3VudC5jb20iLAogICJjbGllbnRfaWQiOiAiMTAwNjQwNDk1NzU3OTQ0MjE2MjgyIiwKICAiYXV0aF91cmkiOiAiaHR0cHM6Ly9hY2NvdW50cy5nb29nbGUuY29tL28vb2F1dGgyL2F1dGgiLAogICJ0b2tlbl91cmkiOiAiaHR0cHM6Ly9vYXV0aDIuZ29vZ2xlYXBpcy5jb20vdG9rZW4iLAogICJhdXRoX3Byb3ZpZGVyX3g1MDlfY2VydF91cmwiOiAiaHR0cHM6Ly93d3cuZ29vZ2xlYXBpcy5jb20vb2F1dGgyL3YxL2NlcnRzIiwKICAiY2xpZW50X3g1MDlfY2VydF91cmwiOiAiaHR0cHM6Ly93d3cuZ29vZ2xlYXBpcy5jb20vcm9ib3QvdjEvbWV0YWRhdGEveDUwOS9maXJlYmFzZS1hZG1pbnNkay14ZWRqNSU0MGV0dXRvci1hcHAtZWIwODkuaWFtLmdzZXJ2aWNlYWNjb3VudC5jb20iCn0K";
}
