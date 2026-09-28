package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.util.Log;
import java.io.ByteArrayInputStream;
import java.io.CharConversionException;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.KeyStoreException;
import java.security.ProviderException;

/* JADX INFO: loaded from: classes4.dex */
public final class b80 {
    public static final Object b = new Object();
    public final rpp a;

    public static final class a {
        public Context a = null;
        public String b = null;
        public String c = null;
        public String d = null;
        public c80 e = null;
        public anp f = null;
        public rpp g;

        public static rpp c(byte[] bArr) throws IOException {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
            try {
                return new rpp(ppp.a(mpp.C(byteArrayInputStream, r3h.a())).a.u());
            } finally {
                byteArrayInputStream.close();
            }
        }

        public final synchronized b80 a() {
            b80 b80Var;
            try {
                if (this.b == null) {
                    throw new IllegalArgumentException("keysetName cannot be null");
                }
                synchronized (b80.b) {
                    try {
                        Context context = this.a;
                        String str = this.b;
                        String str2 = this.c;
                        byte[] bArrA = null;
                        if (str != null) {
                            Context applicationContext = context.getApplicationContext();
                            try {
                                String string = (str2 == null ? PreferenceManager.getDefaultSharedPreferences(applicationContext) : applicationContext.getSharedPreferences(str2, 0)).getString(str, null);
                                if (string != null) {
                                    bArrA = hjl.a(string);
                                }
                            } catch (ClassCastException | IllegalArgumentException unused) {
                                throw new CharConversionException(tug.a("can't read keyset; the pref value ", str, " is not a valid hex string"));
                            }
                        } else {
                            hb5.a("keysetName cannot be null");
                        }
                        String str3 = this.d;
                        if (bArrA == null) {
                            if (str3 != null) {
                                this.e = e();
                            }
                            this.g = b();
                        } else if (str3 != null) {
                            this.g = d(bArrA);
                        } else {
                            this.g = c(bArrA);
                        }
                        b80Var = new b80(this);
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
            return b80Var;
        }

        public final rpp b() throws GeneralSecurityException, IOException {
            if (this.f == null) {
                opp.a("cannot read or generate keyset");
                return null;
            }
            rpp rppVar = new rpp(mpp.B());
            anp anpVar = this.f;
            synchronized (rppVar) {
                rppVar.a(anpVar.a);
            }
            int iW = grh0.a(rppVar.c().a).x().w();
            synchronized (rppVar) {
                for (int i = 0; i < ((mpp) rppVar.a.b).y(); i++) {
                    mpp.b bVarX = ((mpp) rppVar.a.b).x(i);
                    if (bVarX.x() == iW) {
                        if (!bVarX.z().equals(zmp.ENABLED)) {
                            throw new GeneralSecurityException("cannot set key as primary because it's not enabled: " + iW);
                        }
                        mpp.a aVar = rppVar.a;
                        aVar.e();
                        mpp mppVar = (mpp) aVar.b;
                        int i2 = mpp.PRIMARY_KEY_ID_FIELD_NUMBER;
                        mppVar.E(iW);
                    }
                }
                throw new GeneralSecurityException("key not found: " + iW);
            }
            Context context = this.a;
            String str = this.b;
            String str2 = this.c;
            if (str == null) {
                hb5.a("keysetName cannot be null");
                return null;
            }
            Context applicationContext = context.getApplicationContext();
            SharedPreferences.Editor editorEdit = str2 == null ? PreferenceManager.getDefaultSharedPreferences(applicationContext).edit() : applicationContext.getSharedPreferences(str2, 0).edit();
            if (this.e != null) {
                ppp pppVarC = rppVar.c();
                c80 c80Var = this.e;
                byte[] bArr = new byte[0];
                mpp mppVar2 = pppVarC.a;
                byte[] bArrA = c80Var.a(mppVar2.toByteArray(), bArr);
                try {
                    if (!mpp.D(c80Var.b(bArrA, bArr), r3h.a()).equals(mppVar2)) {
                        throw new GeneralSecurityException("cannot encrypt keyset");
                    }
                    m4g.a aVarX = m4g.x();
                    ql5.f fVarC = ql5.c(bArrA, 0, bArrA.length);
                    aVarX.e();
                    ((m4g) aVarX.b).z(fVarC);
                    qpp qppVarA = grh0.a(mppVar2);
                    aVarX.e();
                    ((m4g) aVarX.b).A(qppVarA);
                    if (!editorEdit.putString(str, hjl.b(aVarX.b().toByteArray())).commit()) {
                        i08.a("Failed to write to SharedPreferences");
                        return null;
                    }
                } catch (f0p unused) {
                    opp.a("invalid keyset, corrupted key material");
                    return null;
                }
            } else if (!editorEdit.putString(str, hjl.b(rppVar.c().a.toByteArray())).commit()) {
                i08.a("Failed to write to SharedPreferences");
                return null;
            }
            return rppVar;
        }

        public final rpp d(byte[] bArr) {
            try {
                this.e = new d80().b(this.d);
                try {
                    return new rpp(ppp.c(new a64(new ByteArrayInputStream(bArr)), this.e).a.u());
                } catch (IOException | GeneralSecurityException e) {
                    try {
                        return c(bArr);
                    } catch (IOException unused) {
                        throw e;
                    }
                }
            } catch (GeneralSecurityException | ProviderException e2) {
                try {
                    rpp rppVarC = c(bArr);
                    Log.w("b80", "cannot use Android Keystore, it'll be disabled", e2);
                    return rppVarC;
                } catch (IOException unused2) {
                    throw e2;
                }
            }
        }

        public final c80 e() throws KeyStoreException {
            d80 d80Var = new d80();
            try {
                boolean zC = d80.c(this.d);
                try {
                    return d80Var.b(this.d);
                } catch (GeneralSecurityException | ProviderException e) {
                    if (!zC) {
                        throw new KeyStoreException(tug.a("the master key ", this.d, " exists but is unusable"), e);
                    }
                    Log.w("b80", "cannot use Android Keystore, it'll be disabled", e);
                    return null;
                }
            } catch (GeneralSecurityException | ProviderException e2) {
                Log.w("b80", "cannot use Android Keystore, it'll be disabled", e2);
                return null;
            }
        }
    }

    public b80(a aVar) {
        Context context = aVar.a;
        String str = aVar.b;
        String str2 = aVar.c;
        if (str == null) {
            hb5.a("keysetName cannot be null");
            throw null;
        }
        Context applicationContext = context.getApplicationContext();
        if (str2 == null) {
            PreferenceManager.getDefaultSharedPreferences(applicationContext).edit();
        } else {
            applicationContext.getSharedPreferences(str2, 0).edit();
        }
        this.a = aVar.g;
    }
}
