package com.bytedance.adsdk.ugeno.ok;

import android.database.DataSetObservable;
import android.database.DataSetObserver;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public abstract class tq {
    private final DataSetObservable hww = new DataSetObservable();

    /* JADX INFO: renamed from: tq, reason: collision with root package name */
    private DataSetObserver f32592tq;

    public float hww(int i10) {
        return 1.0f;
    }

    public abstract int hww();

    public abstract boolean hww(View view, Object obj);

    public void sd() {
        synchronized (this) {
            try {
                DataSetObserver dataSetObserver = this.f32592tq;
                if (dataSetObserver != null) {
                    dataSetObserver.onChanged();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.hww.notifyChanged();
    }

    public Parcelable tq() {
        return null;
    }

    public int hww(Object obj) {
        return -1;
    }

    public Object hww(ViewGroup viewGroup, int i10) {
        return hww((View) viewGroup, i10);
    }

    public void hww(ViewGroup viewGroup, int i10, Object obj) {
        hww((View) viewGroup, i10, obj);
    }

    @Deprecated
    public Object hww(View view, int i10) {
        throw new UnsupportedOperationException("Required method instantiateItem was not overridden");
    }

    @Deprecated
    public void hww(View view, int i10, Object obj) {
        throw new UnsupportedOperationException("Required method destroyItem was not overridden");
    }

    public void hww(DataSetObserver dataSetObserver) {
        synchronized (this) {
            this.f32592tq = dataSetObserver;
        }
    }
}
