package defpackage;

import android.app.Activity;
import android.view.Window;
import java.io.IOException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import okhttp3.internal.cache.DiskLruCache;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class efa implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ efa(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Window window;
        switch (this.a) {
            case 0:
                Activity activity = (Activity) this.b;
                Integer num = (Integer) this.c;
                ((use) obj).getClass();
                if (activity != null && (window = activity.getWindow()) != null) {
                    window.setSoftInputMode(16);
                }
                return new jfa.b(num, activity);
            default:
                DiskLruCache diskLruCache = (DiskLruCache) this.b;
                DiskLruCache.Editor editor = (DiskLruCache.Editor) this.c;
                ((IOException) obj).getClass();
                synchronized (diskLruCache) {
                    editor.detach$okhttp();
                }
                return Unit.a;
        }
    }
}
