package defpackage;

import android.content.Context;
import android.util.Pair;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.Callable;
import java.util.zip.GZIPInputStream;
import java.util.zip.ZipInputStream;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class zmt implements Callable {
    public final /* synthetic */ Context a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;

    public /* synthetic */ zmt(Context context, String str, String str2) {
        this.a = context;
        this.b = str;
        this.c = str2;
    }

    /* JADX WARN: Code duplicated, block: B:50:0x0091  */
    @Override // java.util.concurrent.Callable
    public final Object call() {
        xmt xmtVar;
        wot<xmt> wotVar;
        wot<xmt> wotVar2;
        xmt xmtVar2;
        wlx wlxVar;
        Pair pair;
        wot<xmt> wotVarJ;
        akh akhVar;
        wlx wlxVar2;
        Context context = this.a;
        String str = this.b;
        String str2 = this.c;
        zmx zmxVar = yup.b;
        if (zmxVar == null) {
            synchronized (zmx.class) {
                try {
                    zmxVar = yup.b;
                    if (zmxVar == null) {
                        Context applicationContext = context.getApplicationContext();
                        wlx wlxVar3 = yup.c;
                        if (wlxVar3 == null) {
                            synchronized (wlx.class) {
                                try {
                                    wlxVar2 = yup.c;
                                    if (wlxVar2 == null) {
                                        wlxVar2 = new wlx(new xup(applicationContext));
                                        yup.c = wlxVar2;
                                    }
                                } catch (Throwable th) {
                                    throw th;
                                }
                            }
                            wlxVar3 = wlxVar2;
                        }
                        rot yddVar = yup.a;
                        if (yddVar == null) {
                            yddVar = new ydd();
                        }
                        zmxVar = new zmx(wlxVar3, yddVar);
                        yup.b = zmxVar;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        zmx zmxVar2 = zmxVar;
        mot motVarA = null;
        if (str2 == null || (wlxVar = zmxVar2.a) == null) {
            xmtVar = null;
        } else {
            try {
                File fileB = wlxVar.b(str);
                if (fileB == null) {
                    pair = null;
                } else {
                    FileInputStream fileInputStream = new FileInputStream(fileB);
                    if (fileB.getAbsolutePath().endsWith(".zip")) {
                        akhVar = akh.ZIP;
                    } else {
                        akhVar = fileB.getAbsolutePath().endsWith(".gz") ? akh.GZIP : akh.JSON;
                    }
                    fileB.getAbsolutePath();
                    lgt.a();
                    pair = new Pair(akhVar, fileInputStream);
                }
            } catch (FileNotFoundException unused) {
            }
            if (pair == null) {
                xmtVar = null;
            } else {
                akh akhVar2 = (akh) pair.first;
                InputStream inputStream = (InputStream) pair.second;
                int iOrdinal = akhVar2.ordinal();
                if (iOrdinal == 1) {
                    wotVarJ = lnt.j(context, new ZipInputStream(inputStream), str2);
                } else if (iOrdinal != 2) {
                    wotVarJ = lnt.f(tmy.c(inputStream), str2);
                } else {
                    try {
                        wotVarJ = lnt.f(tmy.c(new GZIPInputStream(inputStream)), str2);
                    } catch (IOException e) {
                        wotVarJ = new wot<>(e);
                    }
                }
                xmtVar = wotVarJ.a;
                if (xmtVar == null) {
                    xmtVar = null;
                }
            }
        }
        if (xmtVar != null) {
            wotVar2 = new wot<>(xmtVar);
        } else {
            lgt.a();
            lgt.a();
            try {
                try {
                    motVarA = zmxVar2.b.a(str);
                    if (motVarA.isSuccessful()) {
                        wotVar = zmxVar2.a(context, str, motVarA.X(), motVarA.Q(), str2);
                        xmt xmtVar3 = wotVar.a;
                        lgt.a();
                    } else {
                        wotVar = new wot<>(new IllegalArgumentException(motVarA.h1()));
                    }
                } catch (Exception e2) {
                    wotVar = new wot<>(e2);
                    if (motVarA != null) {
                    }
                    wotVar2 = wotVar;
                    if (str2 != null) {
                        ymt.b.a.c(str2, xmtVar2);
                    }
                    return wotVar2;
                }
                try {
                    motVarA.close();
                } catch (IOException e3) {
                    lgt.c("LottieFetchResult close failed ", e3);
                }
                wotVar2 = wotVar;
            } catch (Throwable th3) {
                if (motVarA == null) {
                    throw th3;
                }
                try {
                    motVarA.close();
                    throw th3;
                } catch (IOException e4) {
                    lgt.c("LottieFetchResult close failed ", e4);
                    throw th3;
                }
            }
        }
        if (str2 != null && (xmtVar2 = wotVar2.a) != null) {
            ymt.b.a.c(str2, xmtVar2);
        }
        return wotVar2;
    }
}
