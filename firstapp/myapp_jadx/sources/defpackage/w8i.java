package defpackage;

import android.content.Context;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
public final class w8i implements Callable<a9i.a> {
    public final /* synthetic */ String a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ v8i c;
    public final /* synthetic */ int d;

    public w8i(String str, Context context, v8i v8iVar, int i) {
        this.a = str;
        this.b = context;
        this.c = v8iVar;
        this.d = i;
    }

    @Override // java.util.concurrent.Callable
    public final a9i.a call() {
        Object[] objArr = {this.c};
        ArrayList arrayList = new ArrayList(1);
        Object obj = objArr[0];
        Objects.requireNonNull(obj);
        arrayList.add(obj);
        return a9i.b(this.a, this.b, Collections.unmodifiableList(arrayList), this.d);
    }
}
