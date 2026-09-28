package defpackage;

import android.os.Debug;
import android.telephony.TelephonyManager;
import com.sporty.android.core.model.service.CountryCodeName;
import com.sportybet.android.home.MainActivity;
import java.util.LinkedHashMap;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes5.dex */
public final class usb implements vsm {
    public final wsm a;

    public usb(wsm wsmVar) {
        this.a = wsmVar;
    }

    @Override // defpackage.vsm
    public final void a(final MainActivity mainActivity, final CountryCodeName countryCodeName, final String str, final erb erbVar) {
        erbVar.getClass();
        rs1.a(new Runnable() { // from class: tsb
            @Override // java.lang.Runnable
            public final void run() {
                String str2;
                String code;
                MainActivity mainActivity2 = mainActivity;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                boolean z = true;
                try {
                    int iC = v4l.d.c(mainActivity2, w4l.a);
                    if (iC == 0) {
                        str2 = "SUCCESS";
                    } else if (iC == 1) {
                        str2 = "SERVICE_MISSING";
                    } else if (iC == 2) {
                        str2 = "SERVICE_VERSION_UPDATE_REQUIRED";
                    } else if (iC == 3) {
                        str2 = "SERVICE_DISABLED";
                    } else if (iC != 9) {
                        str2 = iC != 18 ? "UNKNOWN" : "SERVICE_UPDATING";
                    } else {
                        str2 = "SERVICE_INVALID";
                    }
                } catch (Exception unused) {
                }
                linkedHashMap.put("GoogleService", str2);
                CountryCodeName countryCodeName2 = countryCodeName;
                if (countryCodeName2 == null || (code = countryCodeName2.getCode()) == null) {
                    code = "UNKNOWN";
                }
                linkedHashMap.put("Country", code);
                linkedHashMap.put("Rooted", String.valueOf(ti8.f()));
                linkedHashMap.put("Emulator", String.valueOf(ti8.e()));
                if (!Debug.isDebuggerConnected() && !Debug.waitingForDebugger()) {
                    z = false;
                }
                linkedHashMap.put("DebuggerAttached", String.valueOf(z));
                linkedHashMap.put("SideLoading", String.valueOf(erbVar.isSideLoading(mainActivity2)));
                s9e0 s9e0Var = s9e0.a;
                String strA = ui8.a(mainActivity2);
                s9e0Var.getClass();
                String strA2 = s9e0.a(strA);
                linkedHashMap.put("Installer", strA2 != null ? strA2 : "UNKNOWN");
                String strA3 = s9e0.a(str);
                if (strA3 != null) {
                    linkedHashMap.put("language", strA3);
                }
                Object systemService = mainActivity2.getSystemService("phone");
                systemService.getClass();
                String simOperatorName = ((TelephonyManager) systemService).getSimOperatorName();
                simOperatorName.getClass();
                if (StringsKt.U(simOperatorName)) {
                    simOperatorName = null;
                }
                String strA4 = s9e0.a(simOperatorName != null ? StringsKt.t0(simOperatorName).toString() : null);
                if (strA4 != null) {
                    linkedHashMap.put("Carrier", strA4);
                }
                this.a.a.h(linkedHashMap);
            }
        });
    }

    @Override // defpackage.vsm
    public final void b(final boolean z) {
        rs1.a(new Runnable() { // from class: ssb
            @Override // java.lang.Runnable
            public final void run() {
                this.a.a.e("Foreground", String.valueOf(z));
            }
        });
    }

    @Override // defpackage.vsm
    public final void setUserId(final String str) {
        rs1.a(new Runnable() { // from class: rsb
            @Override // java.lang.Runnable
            public final void run() {
                this.a.a.e("UserId", str);
            }
        });
    }
}
