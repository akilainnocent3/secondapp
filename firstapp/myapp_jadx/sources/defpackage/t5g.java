package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import com.sporty.android.core.model.tracking.AnalyticsEvent;
import java.io.File;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.UnrecoverableKeyException;
import kotlin.Pair;

/* JADX INFO: loaded from: classes4.dex */
public final class t5g {
    public final Context a;
    public final iym b;
    public final auu c;

    public t5g(Context context, iym iymVar) {
        auu auuVarA;
        iymVar.getClass();
        this.a = context;
        this.b = iymVar;
        try {
            auu.a aVar = new auu.a();
            context.getApplicationContext();
            aVar.a();
            auuVarA = auu.a.C0101a.a(aVar);
        } catch (Exception e) {
            d("error_getting_master_key", e);
            e.printStackTrace();
            auuVarA = null;
        }
        this.c = auuVarA;
    }

    public final r5g a(auu auuVar) {
        ppp pppVarC;
        ppp pppVarC2;
        Context context = this.a;
        String str = auuVar.a;
        int i = jbe.a;
        y050.h(kbe.b);
        if (!byf0.a()) {
            y050.f(new bp(yo.class, new ap(ibe.class)), true);
        }
        wm.a();
        Context applicationContext = context.getApplicationContext();
        b80.a aVar = new b80.a();
        aVar.f = cnp.a("AES256_SIV");
        if (applicationContext == null) {
            hb5.a("need an Android context");
            return null;
        }
        aVar.a = applicationContext;
        aVar.b = "__androidx_security_crypto_encrypted_prefs_key_keyset__";
        aVar.c = "com.sportybet.key_encrypted";
        String strA = inm.a("android-keystore://", str);
        if (!strA.startsWith("android-keystore://")) {
            hb5.a("key URI must start with android-keystore://");
            return null;
        }
        aVar.d = strA;
        b80 b80VarA = aVar.a();
        synchronized (b80VarA) {
            pppVarC = b80VarA.a.c();
        }
        b80.a aVar2 = new b80.a();
        aVar2.f = cnp.a("AES256_GCM");
        aVar2.a = applicationContext;
        aVar2.b = "__androidx_security_crypto_encrypted_prefs_value_keyset__";
        aVar2.c = "com.sportybet.key_encrypted";
        String strA2 = inm.a("android-keystore://", str);
        if (!strA2.startsWith("android-keystore://")) {
            hb5.a("key URI must start with android-keystore://");
            return null;
        }
        aVar2.d = strA2;
        b80 b80VarA2 = aVar2.a();
        synchronized (b80VarA2) {
            pppVarC2 = b80VarA2.a.c();
        }
        return new r5g(applicationContext.getSharedPreferences("com.sportybet.key_encrypted", 0), (vm) pppVarC2.b(vm.class), (ibe) pppVarC.b(ibe.class));
    }

    public final SharedPreferences b() {
        SharedPreferences sharedPreferences;
        auu auuVar = this.c;
        if (auuVar != null) {
            try {
                sharedPreferences = a(auuVar);
            } catch (Exception e) {
                e.printStackTrace();
                if ((e instanceof UnrecoverableKeyException) || ((e instanceof KeyStoreException) && (e.getCause() instanceof UnrecoverableKeyException))) {
                    d("error_master_key_unusable", e);
                    Context context = this.a;
                    r5g r5gVarA = null;
                    try {
                        String parent = context.getFilesDir().getParent();
                        if (parent == null) {
                            parent = context.getFilesDir().getAbsolutePath();
                        }
                        File file = new File(parent + "/shared_prefs/com.sportybet.key_encrypted.xml");
                        if (file.exists()) {
                            file.delete();
                        }
                        KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
                        keyStore.load(null);
                        keyStore.deleteEntry("_androidx_security_master_key_");
                        auu.a aVar = new auu.a();
                        context.getApplicationContext();
                        aVar.a();
                        r5gVarA = a(auu.a.C0101a.a(aVar));
                    } catch (Exception e2) {
                        d("error_regenerating_encrypted_preference", e2);
                        e2.printStackTrace();
                    }
                    sharedPreferences = r5gVarA == null ? hp0.A.getSharedPreferences("com.sportybet.key_encrypted", 0) : r5gVarA;
                } else {
                    d("error_creating_master_key", e);
                    sharedPreferences = hp0.A.getSharedPreferences("com.sportybet.key_encrypted", 0);
                }
            }
            if (sharedPreferences != null) {
                return sharedPreferences;
            }
        }
        SharedPreferences sharedPreferences2 = hp0.A.getSharedPreferences("com.sportybet.key_encrypted", 0);
        sharedPreferences2.getClass();
        return sharedPreferences2;
    }

    public final void c(String... strArr) {
        SharedPreferences.Editor editorEdit = b().edit();
        for (String str : strArr) {
            editorEdit.remove(str);
        }
        editorEdit.apply();
    }

    public final void d(String str, Exception exc) {
        this.b.b(kpu.f(new Pair("name", "encrypted_shared_preferences"), new Pair("key", str), new Pair(AnalyticsEvent.BI_TRACKING_KIND_ERROR, exc.toString())));
    }
}
