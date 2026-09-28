package defpackage;

import android.util.Log;
import com.google.firebase.remoteconfig.internal.b;
import java.nio.charset.Charset;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.Executor;
import java.util.regex.Pattern;
import org.json.JSONException;

/* JADX INFO: loaded from: classes4.dex */
public final class uoa {
    public static final Pattern e;
    public static final Pattern f;
    public final HashSet a = new HashSet();
    public final Executor b;
    public final noa c;
    public final noa d;

    static {
        Charset.forName("UTF-8");
        e = Pattern.compile("^(1|true|t|yes|y|on)$", 2);
        f = Pattern.compile("^(0|false|f|no|n|off|)$", 2);
    }

    public uoa(Executor executor, noa noaVar, noa noaVar2) {
        this.b = executor;
        this.c = noaVar;
        this.d = noaVar2;
    }

    public static HashSet b(noa noaVar) {
        HashSet hashSet = new HashSet();
        b bVarC = noaVar.c();
        if (bVarC != null) {
            Iterator<String> itKeys = bVarC.b.keys();
            while (itKeys.hasNext()) {
                hashSet.add(itKeys.next());
            }
        }
        return hashSet;
    }

    public static String c(noa noaVar, String str) {
        b bVarC = noaVar.c();
        if (bVarC == null) {
            return null;
        }
        try {
            return bVarC.b.getString(str);
        } catch (JSONException unused) {
            return null;
        }
    }

    public static void d(String str, String str2) {
        Log.w("FirebaseRemoteConfig", tx5.a("No value of type '", str2, "' exists for parameter key '", str, "'."));
    }

    public final void a(final String str, final b bVar) {
        if (bVar == null) {
            return;
        }
        synchronized (this.a) {
            try {
                for (final j54 j54Var : this.a) {
                    this.b.execute(new Runnable() { // from class: toa
                        @Override // java.lang.Runnable
                        public final void run() {
                            j54Var.accept(str, bVar);
                        }
                    });
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
