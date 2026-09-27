package ma;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.annotation.NonNull;
import androidx.work.r;
import k.y0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
@y0({y0.a.LIBRARY_GROUP})
public abstract class c<T> extends d<T> {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f107154h = r.f("BrdcstRcvrCnstrntTrckr");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final BroadcastReceiver f107155g;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class a extends BroadcastReceiver {
        public a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent != null) {
                c.this.h(context, intent);
            }
        }
    }

    public c(@NonNull Context context, @NonNull ra.a taskExecutor) {
        super(context, taskExecutor);
        this.f107155g = new a();
    }

    @Override // ma.d
    public void e() {
        r.c().a(f107154h, String.format("%s: registering receiver", getClass().getSimpleName()), new Throwable[0]);
        this.f107159b.registerReceiver(this.f107155g, g());
    }

    @Override // ma.d
    public void f() {
        r.c().a(f107154h, String.format("%s: unregistering receiver", getClass().getSimpleName()), new Throwable[0]);
        this.f107159b.unregisterReceiver(this.f107155g);
    }

    public abstract IntentFilter g();

    public abstract void h(Context context, @NonNull Intent intent);
}
