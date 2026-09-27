package l8;

import android.content.Context;
import android.util.Log;
import kotlin.jvm.internal.m0;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @l
    public static final b f103757a = new b();

    @m
    public final <T> T a(@l Context context, @l String tag, @l ds.l<? super Context, ? extends T> manager) {
        m0.p(context, "context");
        m0.p(tag, "tag");
        m0.p(manager, "manager");
        try {
            return manager.invoke(context);
        } catch (NoClassDefFoundError unused) {
            Log.d(tag, "Unable to find adservices code, check manifest for uses-library tag, versionS=" + a.f103754a.b());
            return null;
        }
    }
}
