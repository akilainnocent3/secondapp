package com.google.android.flexbox;

import android.view.View;
import com.google.protobuf.Reader;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class a {
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public float j;
    public float k;
    public int l;
    public int m;
    public int o;
    public int p;
    public boolean q;
    public boolean r;
    public int a = Reader.READ_DONE;
    public int b = Reader.READ_DONE;
    public int c = Integer.MIN_VALUE;
    public int d = Integer.MIN_VALUE;
    public final ArrayList n = new ArrayList();

    public final int a() {
        return this.h - this.i;
    }

    public final void b(View view, int i, int i2, int i3, int i4) {
        FlexItem flexItem = (FlexItem) view.getLayoutParams();
        this.a = Math.min(this.a, (view.getLeft() - flexItem.a1()) - i);
        this.b = Math.min(this.b, (view.getTop() - flexItem.V()) - i2);
        this.c = Math.max(this.c, view.getRight() + flexItem.v1() + i3);
        this.d = Math.max(this.d, view.getBottom() + flexItem.X0() + i4);
    }
}
