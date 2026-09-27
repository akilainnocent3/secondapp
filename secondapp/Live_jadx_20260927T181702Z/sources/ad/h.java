package ad;

import android.content.ComponentName;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.text.TextUtils;
import com.digitalturbine.ignite.cl.aidl.IIgniteServiceAPI;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.UnrecoverableEntryException;
import java.security.cert.CertificateException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.crypto.NoSuchPaddingException;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class h extends f {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public yc.d f4824d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public yc.a f4825e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final nd.a f4826f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final hd.b f4827g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public yc.c f4828h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public dd.a f4829i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f4830j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f4831k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final AtomicBoolean f4832l;

    public h(a aVar, boolean z10, boolean z11, ed.a aVar2, yc.a aVar3) {
        super(aVar, aVar2);
        this.f4830j = false;
        this.f4831k = false;
        this.f4832l = new AtomicBoolean(false);
        this.f4825e = aVar3;
        this.f4830j = z10;
        this.f4827g = new hd.b();
        this.f4826f = new nd.a(aVar.g());
        this.f4831k = z11;
        if (z11) {
            this.f4824d = new yc.d(aVar.g(), this, this);
        }
    }

    @Override // ad.f, ad.a
    public final void b() {
        if (this.f4828h == null) {
            Object[] objArr = {"OneDTAuthenticator"};
            gd.a aVar = gd.b.f86434b.f86435a;
            if (aVar != null) {
                aVar.i("%s : initializing new Ignite authentication session", objArr);
            }
            nd.a aVar2 = this.f4826f;
            aVar2.getClass();
            try {
                aVar2.f116441b.c();
            } catch (IOException e10) {
                e = e10;
                cd.b.b(cd.d.ENCRYPTION_EXCEPTION, kd.a.a(e, cd.c.FAILED_INIT_ENCRYPTION));
            } catch (InvalidAlgorithmParameterException e11) {
                e = e11;
                cd.b.b(cd.d.ENCRYPTION_EXCEPTION, kd.a.a(e, cd.c.FAILED_INIT_ENCRYPTION));
            } catch (InvalidKeyException e12) {
                e = e12;
                cd.b.b(cd.d.ENCRYPTION_EXCEPTION, kd.a.a(e, cd.c.FAILED_INIT_ENCRYPTION));
            } catch (KeyStoreException e13) {
                e = e13;
                cd.b.b(cd.d.ENCRYPTION_EXCEPTION, kd.a.a(e, cd.c.FAILED_INIT_ENCRYPTION));
            } catch (NoSuchAlgorithmException e14) {
                e = e14;
                cd.b.b(cd.d.ENCRYPTION_EXCEPTION, kd.a.a(e, cd.c.FAILED_INIT_ENCRYPTION));
            } catch (NoSuchProviderException e15) {
                e = e15;
                cd.b.b(cd.d.ENCRYPTION_EXCEPTION, kd.a.a(e, cd.c.FAILED_INIT_ENCRYPTION));
            } catch (UnrecoverableEntryException e16) {
                e = e16;
                cd.b.b(cd.d.ENCRYPTION_EXCEPTION, kd.a.a(e, cd.c.FAILED_INIT_ENCRYPTION));
            } catch (CertificateException e17) {
                e = e17;
                cd.b.b(cd.d.ENCRYPTION_EXCEPTION, kd.a.a(e, cd.c.FAILED_INIT_ENCRYPTION));
            } catch (NoSuchPaddingException e18) {
                e = e18;
                cd.b.b(cd.d.ENCRYPTION_EXCEPTION, kd.a.a(e, cd.c.FAILED_INIT_ENCRYPTION));
            } catch (Exception e19) {
                cd.b.b(cd.d.ENCRYPTION_EXCEPTION, kd.a.a(e19, cd.c.FAILED_INIT_ENCRYPTION));
            }
            String strA = this.f4826f.a();
            this.f4827g.getClass();
            yc.c cVarA = hd.b.a(strA);
            this.f4828h = cVarA;
            if (cVarA.f159157b > TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis())) {
                gd.b.a("%s : One DT resolved from cache", "OneDTAuthenticator");
                yc.c cVar = this.f4828h;
                yc.a aVar3 = this.f4825e;
                if (aVar3 != null) {
                    gd.b.a("%s : setting one dt entity", "IgniteManager");
                    aVar3.f159154b = cVar;
                }
            } else {
                this.f4832l.set(true);
            }
        }
        if (this.f4831k && this.f4824d == null) {
            gd.b.b("%s : unable to authenticate: authenticator destroyed", "OneDTAuthenticator");
            a("Unable to authenticate: authenticator destroyed");
            return;
        }
        if (!this.f4830j && !this.f4832l.get()) {
            if (this.f4831k) {
                this.f4824d.a();
            }
        } else {
            Object[] objArr2 = {"OneDTAuthenticator"};
            gd.a aVar4 = gd.b.f86434b.f86435a;
            if (aVar4 != null) {
                aVar4.i("%s : will try to authenticate with Ignite if didn't done yet", objArr2);
            }
            this.f4822b.b();
        }
    }

    @Override // ad.f, ad.a
    public final void c(ComponentName componentName, IBinder iBinder) {
        ed.a aVar;
        boolean zJ = this.f4822b.j();
        if (!zJ && (aVar = this.f4823c) != null) {
            aVar.onOdtUnsupported();
        }
        if (this.f4824d != null && this.f4822b.j() && this.f4831k) {
            this.f4824d.a();
        }
        if (zJ || this.f4830j) {
            super.c(componentName, iBinder);
        }
    }

    @Override // ad.f, ad.a
    public final String d() {
        a aVar = this.f4822b;
        if (aVar instanceof f) {
            return aVar.d();
        }
        return null;
    }

    @Override // ad.f, ad.a
    public final void destroy() {
        this.f4825e = null;
        yc.d dVar = this.f4824d;
        if (dVar != null) {
            id.a aVar = dVar.f159158a;
            if (aVar != null && aVar.f90587b) {
                dVar.f159159b.unregisterReceiver(aVar);
                dVar.f159158a.f90587b = false;
            }
            id.a aVar2 = dVar.f159158a;
            if (aVar2 != null) {
                aVar2.f90586a = null;
                dVar.f159158a = null;
            }
            dVar.f159160c = null;
            dVar.f159159b = null;
            dVar.f159161d = null;
            this.f4824d = null;
        }
        dd.a aVar3 = this.f4829i;
        if (aVar3 != null) {
            zc.b bVar = aVar3.f78864b;
            if (bVar != null) {
                bVar.f160977c.clear();
                aVar3.f78864b = null;
            }
            aVar3.f78865c = null;
            aVar3.f78863a = null;
            this.f4829i = null;
        }
        this.f4823c = null;
        this.f4822b.destroy();
    }

    @Override // ad.f, ad.a
    public final String i() {
        a aVar = this.f4822b;
        if (aVar instanceof f) {
            return aVar.i();
        }
        return null;
    }

    @Override // ad.f, ad.a
    public final boolean j() {
        return this.f4822b.j();
    }

    @Override // ad.f, ad.a
    public final void l() {
        b();
    }

    public final void n() {
        IIgniteServiceAPI iIgniteServiceAPIK = this.f4822b.k();
        if (iIgniteServiceAPIK == null) {
            gd.b.b("%s : service is unavailable", "OneDTAuthenticator");
            cd.b.b(cd.d.ONE_DT_REQUEST_ERROR, "error_code", cd.c.IGNITE_SERVICE_UNAVAILABLE.d());
            return;
        }
        if (this.f4829i == null) {
            this.f4829i = new dd.a(iIgniteServiceAPIK, this);
        }
        if (TextUtils.isEmpty(this.f4822b.e())) {
            cd.b.b(cd.d.ONE_DT_REQUEST_ERROR, "error_code", cd.c.IGNITE_SERVICE_INVALID_SESSION.d());
            gd.b.b("%s : service session is unavailable", "OneDTAuthenticator");
            return;
        }
        dd.a aVar = this.f4829i;
        String strE = this.f4822b.e();
        aVar.getClass();
        try {
            Bundle bundle = new Bundle();
            bundle.putString("clientToken", strE);
            aVar.f78865c.getProperty("onedtid", bundle, new Bundle(), aVar.f78864b);
        } catch (RemoteException e10) {
            cd.b.a(cd.d.ONE_DT_REQUEST_ERROR, e10);
            gd.b.b("%s : request failed : %s", "OneDTPropertyHandler", e10.toString());
        }
    }

    @Override // ad.f, ad.a
    public final void c(String str) {
        super.c(str);
        if (this.f4822b.h() && this.f4832l.get() && this.f4822b.j()) {
            this.f4832l.set(false);
            n();
        }
    }
}
