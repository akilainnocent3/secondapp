package defpackage;

import android.content.Context;
import com.twilio.voice.Constants;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.HashMap;
import java.util.zip.GZIPInputStream;
import java.util.zip.ZipInputStream;

/* JADX INFO: loaded from: classes.dex */
public final class zmx {
    public final wlx a;
    public final rot b;

    public zmx(wlx wlxVar, rot rotVar) {
        this.a = wlxVar;
        this.b = rotVar;
    }

    public final wot<xmt> a(Context context, String str, InputStream inputStream, String str2, String str3) {
        wot<xmt> wotVarJ;
        akh akhVar;
        if (str2 == null) {
            str2 = Constants.APP_JSON_PAYLOAD_TYPE;
        }
        boolean zContains = str2.contains("application/zip");
        wlx wlxVar = this.a;
        if (zContains || str2.contains("application/x-zip") || str2.contains("application/x-zip-compressed") || str.split("\\?")[0].endsWith(".lottie")) {
            lgt.a();
            akh akhVar2 = akh.ZIP;
            wotVarJ = (str3 == null || wlxVar == null) ? lnt.j(context, new ZipInputStream(inputStream), null) : lnt.j(context, new ZipInputStream(new FileInputStream(wlxVar.d(str, inputStream, akhVar2))), str);
            akhVar = akhVar2;
        } else if (str2.contains("application/gzip") || str2.contains("application/x-gzip") || str.split("\\?")[0].endsWith(".tgs")) {
            lgt.a();
            akhVar = akh.GZIP;
            if (str3 == null || wlxVar == null) {
                GZIPInputStream gZIPInputStream = new GZIPInputStream(inputStream);
                HashMap map = lnt.a;
                wotVarJ = lnt.f(tmy.c(gZIPInputStream), null);
            } else {
                GZIPInputStream gZIPInputStream2 = new GZIPInputStream(new FileInputStream(wlxVar.d(str, inputStream, akhVar)));
                HashMap map2 = lnt.a;
                wotVarJ = lnt.f(tmy.c(gZIPInputStream2), str);
            }
        } else {
            lgt.a();
            akhVar = akh.JSON;
            if (str3 == null || wlxVar == null) {
                HashMap map3 = lnt.a;
                wotVarJ = lnt.f(tmy.c(inputStream), null);
            } else {
                FileInputStream fileInputStream = new FileInputStream(wlxVar.d(str, inputStream, akhVar).getAbsolutePath());
                HashMap map4 = lnt.a;
                wotVarJ = lnt.f(tmy.c(fileInputStream), str);
            }
        }
        if (str3 != null && wotVarJ.a != null && wlxVar != null) {
            File file = new File(wlxVar.c(), wlx.a(str, akhVar, true));
            File file2 = new File(file.getAbsolutePath().replace(".temp", ""));
            boolean zRenameTo = file.renameTo(file2);
            file2.toString();
            lgt.a();
            if (!zRenameTo) {
                lgt.b("Unable to rename cache file " + file.getAbsolutePath() + " to " + file2.getAbsolutePath() + ".");
            }
        }
        return wotVarJ;
    }
}
