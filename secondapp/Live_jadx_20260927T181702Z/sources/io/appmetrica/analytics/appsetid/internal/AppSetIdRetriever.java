package io.appmetrica.analytics.appsetid.internal;

import android.content.Context;
import com.google.android.gms.appset.AppSet;
import com.google.android.gms.appset.AppSetIdInfo;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import io.appmetrica.analytics.coreapi.internal.identifiers.AppSetIdScope;
import java.util.ArrayList;
import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class AppSetIdRetriever implements IAppSetIdRetriever {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f95015a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ArrayList f95016b = new ArrayList();

    public static final AppSetIdScope access$convertScope(AppSetIdRetriever appSetIdRetriever, int i10) {
        appSetIdRetriever.getClass();
        if (i10 != 1) {
            return i10 != 2 ? AppSetIdScope.UNKNOWN : AppSetIdScope.DEVELOPER;
        }
        return AppSetIdScope.APP;
    }

    @Override // io.appmetrica.analytics.appsetid.internal.IAppSetIdRetriever
    public void retrieveAppSetId(@l Context context, @l final AppSetIdListener appSetIdListener) throws Throwable {
        Task<AppSetIdInfo> appSetIdInfo = AppSet.getClient(context).getAppSetIdInfo();
        OnCompleteListener<AppSetIdInfo> onCompleteListener = new OnCompleteListener<AppSetIdInfo>() { // from class: io.appmetrica.analytics.appsetid.internal.AppSetIdRetriever$retrieveAppSetId$onCompleteListener$1
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public void onComplete(@l Task<AppSetIdInfo> task) {
                Object obj = this.f95017a.f95015a;
                AppSetIdRetriever appSetIdRetriever = this.f95017a;
                synchronized (obj) {
                    appSetIdRetriever.f95016b.remove(this);
                }
                if (task.isSuccessful()) {
                    appSetIdListener.onAppSetIdRetrieved(task.getResult().getId(), AppSetIdRetriever.access$convertScope(this.f95017a, task.getResult().getScope()));
                } else {
                    appSetIdListener.onFailure(task.getException());
                }
            }
        };
        synchronized (this.f95015a) {
            this.f95016b.add(onCompleteListener);
        }
        appSetIdInfo.addOnCompleteListener(onCompleteListener);
    }
}
