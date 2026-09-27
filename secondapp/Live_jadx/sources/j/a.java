package j;

import android.content.Context;
import android.content.Intent;
import kotlin.jvm.internal.m0;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public abstract class a<I, O> {

    /* JADX INFO: renamed from: j.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class C0927a<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final T f99189a;

        public C0927a(T t10) {
            this.f99189a = t10;
        }

        public final T a() {
            return this.f99189a;
        }
    }

    @l
    public abstract Intent a(@l Context context, I i10);

    @m
    public C0927a<O> b(@l Context context, I i10) {
        m0.p(context, "context");
        return null;
    }

    public abstract O c(int i10, @m Intent intent);
}
