package io.appmetrica.analytics.impl;

import android.content.Context;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.coreapi.internal.system.PermissionExtractor;
import io.appmetrica.analytics.coreutils.internal.AndroidUtils;
import io.appmetrica.analytics.coreutils.internal.cache.CachedDataProvider;
import io.appmetrica.analytics.coreutils.internal.system.SystemServiceUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.ol, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class C5283ol implements InterfaceC5384sn {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final long f98081d = TimeUnit.SECONDS.toMillis(20);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f98082a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PermissionExtractor f98083b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CachedDataProvider.CachedData f98084c;

    public C5283ol(Context context) {
        long j10 = f98081d;
        this.f98084c = new CachedDataProvider.CachedData(j10, j10, "sim-info");
        this.f98082a = context;
        this.f98083b = C5272oa.k().j();
    }

    public final C5156jl b() {
        return new C5156jl((Integer) SystemServiceUtils.accessSystemServiceByNameSafely(this.f98082a, "phone", "getting SimMcc", "TelephonyManager", new C5182kl()), (Integer) SystemServiceUtils.accessSystemServiceByNameSafely(this.f98082a, "phone", "getting SimMnc", "TelephonyManager", new C5208ll()), ((Boolean) SystemServiceUtils.accessSystemServiceByNameSafelyOrDefault(this.f98082a, "phone", "getting NetworkRoaming", "TelephonyManager", Boolean.FALSE, new C5258nl(this))).booleanValue(), (String) SystemServiceUtils.accessSystemServiceByNameSafely(this.f98082a, "phone", "getting SimOperatorName", "TelephonyManager", new C5233ml()));
    }

    /* JADX WARN: Code duplicated, block: B:14:0x002f A[Catch: all -> 0x001a, TryCatch #0 {all -> 0x001a, blocks: (B:3:0x0001, B:5:0x000b, B:7:0x0011, B:12:0x001c, B:14:0x002f, B:16:0x0037, B:18:0x0043, B:19:0x004c, B:21:0x0052, B:22:0x005a, B:23:0x0061), top: B:28:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:16:0x0037 A[Catch: all -> 0x001a, TryCatch #0 {all -> 0x001a, blocks: (B:3:0x0001, B:5:0x000b, B:7:0x0011, B:12:0x001c, B:14:0x002f, B:16:0x0037, B:18:0x0043, B:19:0x004c, B:21:0x0052, B:22:0x005a, B:23:0x0061), top: B:28:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:18:0x0043 A[Catch: all -> 0x001a, TryCatch #0 {all -> 0x001a, blocks: (B:3:0x0001, B:5:0x000b, B:7:0x0011, B:12:0x001c, B:14:0x002f, B:16:0x0037, B:18:0x0043, B:19:0x004c, B:21:0x0052, B:22:0x005a, B:23:0x0061), top: B:28:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:21:0x0052 A[Catch: all -> 0x001a, TryCatch #0 {all -> 0x001a, blocks: (B:3:0x0001, B:5:0x000b, B:7:0x0011, B:12:0x001c, B:14:0x002f, B:16:0x0037, B:18:0x0043, B:19:0x004c, B:21:0x0052, B:22:0x005a, B:23:0x0061), top: B:28:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:22:0x005a A[Catch: all -> 0x001a, TryCatch #0 {all -> 0x001a, blocks: (B:3:0x0001, B:5:0x000b, B:7:0x0011, B:12:0x001c, B:14:0x002f, B:16:0x0037, B:18:0x0043, B:19:0x004c, B:21:0x0052, B:22:0x005a, B:23:0x0061), top: B:28:0x0001 }] */
    @Override // io.appmetrica.analytics.impl.InterfaceC5384sn
    @Nullable
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final synchronized List<C5156jl> a() {
        ArrayList arrayList;
        List<C5156jl> list;
        try {
            List<C5156jl> list2 = (List) this.f98084c.getData();
            if (list2 == null) {
                arrayList = new ArrayList();
                if (C5272oa.I.f98052u.b().f97453n.f97870d) {
                    if (AndroidUtils.isApiAchieved(23)) {
                        if (this.f98083b.hasPermission(this.f98082a, "android.permission.READ_PHONE_STATE")) {
                            arrayList.addAll(C5308pl.a(this.f98082a));
                        }
                        if (arrayList.size() == 0) {
                            arrayList.add(b());
                        }
                    } else {
                        arrayList.add(b());
                    }
                }
                this.f98084c.setData(arrayList);
                list = arrayList;
            } else if (list2.isEmpty() && this.f98084c.shouldUpdateData()) {
                list = list2;
                list = list2;
                arrayList = new ArrayList();
                if (C5272oa.I.f98052u.b().f97453n.f97870d) {
                    if (AndroidUtils.isApiAchieved(23)) {
                        if (this.f98083b.hasPermission(this.f98082a, "android.permission.READ_PHONE_STATE")) {
                            arrayList.addAll(C5308pl.a(this.f98082a));
                        }
                        if (arrayList.size() == 0) {
                            arrayList.add(b());
                        }
                    } else {
                        arrayList.add(b());
                    }
                }
                this.f98084c.setData(arrayList);
                list = arrayList;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return list;
    }
}
