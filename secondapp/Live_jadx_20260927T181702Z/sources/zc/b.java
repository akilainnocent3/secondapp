package zc;

import ad.h;
import android.text.TextUtils;
import cd.c;
import cd.d;
import com.digitalturbine.ignite.cl.aidl.IIgniteServiceCallback;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class b extends IIgniteServiceCallback.Stub {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f160977c;

    public b(dd.a aVar) {
        ArrayList arrayList = new ArrayList();
        this.f160977c = arrayList;
        arrayList.add(aVar);
    }

    @Override // com.digitalturbine.ignite.cl.aidl.IIgniteServiceCallback
    public final void onError(String str) {
        gd.b.a("%s : unable to retrieve property: %s", "IgnitePropertyCallback", str);
        Iterator it = this.f160977c.iterator();
        while (it.hasNext()) {
            h hVar = ((dd.a) it.next()).f78863a;
            if (hVar != null) {
                gd.b.a("%s : on one dt error", "OneDTAuthenticator");
                hVar.f4832l.set(true);
                if (hVar.f4825e != null) {
                    gd.b.b("%s : on one dt error : %s", "IgniteManager", str);
                }
            }
        }
    }

    @Override // com.digitalturbine.ignite.cl.aidl.IIgniteServiceCallback
    public final void onSuccess(String str) {
        gd.b.a("%s : property retrieved", "IgnitePropertyCallback");
        Iterator it = this.f160977c.iterator();
        while (it.hasNext()) {
            h hVar = ((dd.a) it.next()).f78863a;
            if (hVar != null) {
                if (TextUtils.isEmpty(str)) {
                    gd.b.a("%s : on one dt error", "OneDTAuthenticator");
                    hVar.f4832l.set(true);
                    if (hVar.f4825e != null) {
                        gd.b.b("%s : on one dt error : %s", "IgniteManager", "One DT is empty");
                    }
                    cd.b.b(d.RAW_ONE_DT_ERROR, "error_code", c.ONE_DT_EMPTY_ENTITY.d());
                } else {
                    hVar.f4826f.b(str);
                    hVar.f4827g.getClass();
                    yc.c cVarA = hd.b.a(str);
                    hVar.f4828h = cVarA;
                    yc.a aVar = hVar.f4825e;
                    if (aVar != null) {
                        gd.b.a("%s : setting one dt entity", "IgniteManager");
                        aVar.f159154b = cVarA;
                    }
                }
            }
        }
    }

    @Override // com.digitalturbine.ignite.cl.aidl.IIgniteServiceCallback
    public final void onProgress(String str) {
    }

    @Override // com.digitalturbine.ignite.cl.aidl.IIgniteServiceCallback
    public final void onScheduled(String str) {
    }

    @Override // com.digitalturbine.ignite.cl.aidl.IIgniteServiceCallback
    public final void onStart(String str) {
    }
}
