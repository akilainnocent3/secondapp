package com.airbnb.lottie;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import com.airbnb.lottie.LottieAnimationView;
import com.sportybet.android.gp.tz.R;
import defpackage.a8n;
import defpackage.aff0;
import defpackage.b11;
import defpackage.b8i;
import defpackage.b8n;
import defpackage.bpt;
import defpackage.c8i;
import defpackage.cpt;
import defpackage.fnt;
import defpackage.got;
import defpackage.hb5;
import defpackage.hk30;
import defpackage.iot;
import defpackage.lnt;
import defpackage.o0b;
import defpackage.qot;
import defpackage.rmp;
import defpackage.rqv;
import defpackage.sj90;
import defpackage.smt;
import defpackage.uot;
import defpackage.v750;
import defpackage.vd00;
import defpackage.vot;
import defpackage.wma;
import defpackage.wot;
import defpackage.xmt;
import defpackage.xnt;
import defpackage.yot;
import defpackage.zmt;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.zip.ZipInputStream;

/* JADX INFO: loaded from: classes.dex */
public class LottieAnimationView extends AppCompatImageView {
    public static final smt F = new smt();
    public boolean A;
    public boolean B;
    public final HashSet C;
    public final HashSet D;
    public yot<xmt> E;
    public final c d;
    public final b e;
    public qot<Throwable> f;
    public int i;
    public final iot v;
    public String w;
    public int y;
    public boolean z;

    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();
        public String a;
        public int b;
        public float c;
        public boolean d;
        public String e;
        public int f;
        public int i;

        public class a implements Parcelable.Creator<SavedState> {
            @Override // android.os.Parcelable.Creator
            public final SavedState createFromParcel(Parcel parcel) {
                SavedState savedState = new SavedState(parcel);
                savedState.a = parcel.readString();
                savedState.c = parcel.readFloat();
                savedState.d = parcel.readInt() == 1;
                savedState.e = parcel.readString();
                savedState.f = parcel.readInt();
                savedState.i = parcel.readInt();
                return savedState;
            }

            @Override // android.os.Parcelable.Creator
            public final SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeString(this.a);
            parcel.writeFloat(this.c);
            parcel.writeInt(this.d ? 1 : 0);
            parcel.writeString(this.e);
            parcel.writeInt(this.f);
            parcel.writeInt(this.i);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {
        public static final a a;
        public static final a b;
        public static final a c;
        public static final a d;
        public static final a e;
        public static final a f;
        public static final /* synthetic */ a[] i;

        static {
            a aVar = new a("SET_ANIMATION", 0);
            a = aVar;
            a aVar2 = new a("SET_PROGRESS", 1);
            b = aVar2;
            a aVar3 = new a("SET_REPEAT_MODE", 2);
            c = aVar3;
            a aVar4 = new a("SET_REPEAT_COUNT", 3);
            d = aVar4;
            a aVar5 = new a("SET_IMAGE_ASSETS", 4);
            e = aVar5;
            a aVar6 = new a("PLAY_OPTION", 5);
            f = aVar6;
            i = new a[]{aVar, aVar2, aVar3, aVar4, aVar5, aVar6};
        }

        public a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) i.clone();
        }
    }

    public static class b implements qot<Throwable> {
        public final WeakReference<LottieAnimationView> a;

        public b(LottieAnimationView lottieAnimationView) {
            this.a = new WeakReference<>(lottieAnimationView);
        }

        @Override // defpackage.qot
        public final void onResult(Throwable th) {
            Throwable th2 = th;
            LottieAnimationView lottieAnimationView = this.a.get();
            if (lottieAnimationView == null) {
                return;
            }
            int i = lottieAnimationView.i;
            if (i != 0) {
                lottieAnimationView.setImageResource(i);
            }
            qot qotVar = lottieAnimationView.f;
            if (qotVar == null) {
                qotVar = LottieAnimationView.F;
            }
            qotVar.onResult(th2);
        }
    }

    public static class c implements qot<xmt> {
        public final WeakReference<LottieAnimationView> a;

        public c(LottieAnimationView lottieAnimationView) {
            this.a = new WeakReference<>(lottieAnimationView);
        }

        @Override // defpackage.qot
        public final void onResult(xmt xmtVar) {
            xmt xmtVar2 = xmtVar;
            LottieAnimationView lottieAnimationView = this.a.get();
            if (lottieAnimationView == null) {
                return;
            }
            lottieAnimationView.setComposition(xmtVar2);
        }
    }

    public LottieAnimationView(Context context) {
        super(context);
        this.d = new c(this);
        this.e = new b(this);
        this.i = 0;
        this.v = new iot();
        this.z = false;
        this.A = false;
        this.B = true;
        this.C = new HashSet();
        this.D = new HashSet();
        d(null, R.attr.lottieAnimationViewStyle);
    }

    private void setCompositionTask(yot<xmt> yotVar) {
        wot<xmt> wotVar = yotVar.d;
        iot iotVar = this.v;
        if (wotVar != null && iotVar == getDrawable() && iotVar.a == wotVar.a) {
            return;
        }
        this.C.add(a.a);
        this.v.d();
        c();
        yotVar.b(this.d);
        yotVar.a(this.e);
        this.E = yotVar;
    }

    public final void c() {
        yot<xmt> yotVar = this.E;
        if (yotVar != null) {
            c cVar = this.d;
            synchronized (yotVar) {
                yotVar.a.remove(cVar);
            }
            yot<xmt> yotVar2 = this.E;
            b bVar = this.e;
            synchronized (yotVar2) {
                yotVar2.b.remove(bVar);
            }
        }
    }

    public final void d(AttributeSet attributeSet, int i) {
        String string;
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, hk30.a, i, 0);
        this.B = typedArrayObtainStyledAttributes.getBoolean(4, true);
        boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(16);
        boolean zHasValue2 = typedArrayObtainStyledAttributes.hasValue(11);
        boolean zHasValue3 = typedArrayObtainStyledAttributes.hasValue(21);
        if (zHasValue && zHasValue2) {
            hb5.a("lottie_rawRes and lottie_fileName cannot be used at the same time. Please use only one at once.");
            return;
        }
        if (zHasValue) {
            int resourceId = typedArrayObtainStyledAttributes.getResourceId(16, 0);
            if (resourceId != 0) {
                setAnimation(resourceId);
            }
        } else if (zHasValue2) {
            String string2 = typedArrayObtainStyledAttributes.getString(11);
            if (string2 != null) {
                setAnimation(string2);
            }
        } else if (zHasValue3 && (string = typedArrayObtainStyledAttributes.getString(21)) != null) {
            setAnimationFromUrl(string);
        }
        setFallbackResource(typedArrayObtainStyledAttributes.getResourceId(10, 0));
        if (typedArrayObtainStyledAttributes.getBoolean(3, false)) {
            this.A = true;
        }
        boolean z = typedArrayObtainStyledAttributes.getBoolean(14, false);
        iot iotVar = this.v;
        if (z) {
            iotVar.b.setRepeatCount(-1);
        }
        if (typedArrayObtainStyledAttributes.hasValue(19)) {
            setRepeatMode(typedArrayObtainStyledAttributes.getInt(19, 1));
        }
        if (typedArrayObtainStyledAttributes.hasValue(18)) {
            setRepeatCount(typedArrayObtainStyledAttributes.getInt(18, -1));
        }
        if (typedArrayObtainStyledAttributes.hasValue(20)) {
            setSpeed(typedArrayObtainStyledAttributes.getFloat(20, 1.0f));
        }
        if (typedArrayObtainStyledAttributes.hasValue(6)) {
            setClipToCompositionBounds(typedArrayObtainStyledAttributes.getBoolean(6, true));
        }
        if (typedArrayObtainStyledAttributes.hasValue(5)) {
            setClipTextToBoundingBox(typedArrayObtainStyledAttributes.getBoolean(5, false));
        }
        if (typedArrayObtainStyledAttributes.hasValue(8)) {
            setDefaultFontFileExtension(typedArrayObtainStyledAttributes.getString(8));
        }
        setImageAssetsFolder(typedArrayObtainStyledAttributes.getString(13));
        boolean zHasValue4 = typedArrayObtainStyledAttributes.hasValue(15);
        float f = typedArrayObtainStyledAttributes.getFloat(15, 0.0f);
        if (zHasValue4) {
            this.C.add(a.b);
        }
        iotVar.y(f);
        iotVar.h(typedArrayObtainStyledAttributes.getBoolean(9, false));
        setApplyingOpacityToLayersEnabled(typedArrayObtainStyledAttributes.getBoolean(0, false));
        setApplyingShadowToLayersEnabled(typedArrayObtainStyledAttributes.getBoolean(1, true));
        if (typedArrayObtainStyledAttributes.hasValue(7)) {
            iotVar.a(new rmp("**"), vot.I, new cpt(new sj90(o0b.b(getContext(), typedArrayObtainStyledAttributes.getResourceId(7, -1)).getDefaultColor(), PorterDuff.Mode.SRC_ATOP)));
        }
        if (typedArrayObtainStyledAttributes.hasValue(17)) {
            int i2 = typedArrayObtainStyledAttributes.getInt(17, 0);
            if (i2 >= v750.values().length) {
                i2 = 0;
            }
            setRenderMode(v750.values()[i2]);
        }
        if (typedArrayObtainStyledAttributes.hasValue(2)) {
            int i3 = typedArrayObtainStyledAttributes.getInt(2, 0);
            if (i3 >= v750.values().length) {
                i3 = 0;
            }
            setAsyncUpdates(b11.values()[i3]);
        }
        setIgnoreDisabledSystemAnimations(typedArrayObtainStyledAttributes.getBoolean(12, false));
        if (typedArrayObtainStyledAttributes.hasValue(22)) {
            setUseCompositionFrameRate(typedArrayObtainStyledAttributes.getBoolean(22, false));
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public b11 getAsyncUpdates() {
        b11 b11Var = this.v.b0;
        return b11Var != null ? b11Var : b11.a;
    }

    public boolean getAsyncUpdatesEnabled() {
        b11 b11Var = this.v.b0;
        if (b11Var == null) {
            b11Var = b11.a;
        }
        return b11Var == b11.b;
    }

    public boolean getClipTextToBoundingBox() {
        return this.v.K;
    }

    public boolean getClipToCompositionBounds() {
        return this.v.D;
    }

    public xmt getComposition() {
        Drawable drawable = getDrawable();
        iot iotVar = this.v;
        if (drawable == iotVar) {
            return iotVar.a;
        }
        return null;
    }

    public long getDuration() {
        xmt composition = getComposition();
        if (composition != null) {
            return (long) composition.b();
        }
        return 0L;
    }

    public int getFrame() {
        return (int) this.v.b.v;
    }

    public String getImageAssetsFolder() {
        return this.v.w;
    }

    public boolean getMaintainOriginalImageBounds() {
        return this.v.C;
    }

    public float getMaxFrame() {
        return this.v.b.e();
    }

    public float getMinFrame() {
        return this.v.b.f();
    }

    public vd00 getPerformanceTracker() {
        xmt xmtVar = this.v.a;
        if (xmtVar != null) {
            return xmtVar.a;
        }
        return null;
    }

    public float getProgress() {
        return this.v.b.d();
    }

    public v750 getRenderMode() {
        return this.v.M ? v750.c : v750.b;
    }

    public int getRepeatCount() {
        return this.v.b.getRepeatCount();
    }

    public int getRepeatMode() {
        return this.v.b.getRepeatMode();
    }

    public float getSpeed() {
        return this.v.b.d;
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        Drawable drawable = getDrawable();
        if (drawable instanceof iot) {
            boolean z = ((iot) drawable).M;
            v750 v750Var = v750.c;
            if ((z ? v750Var : v750.b) == v750Var) {
                this.v.invalidateSelf();
            }
        }
    }

    @Override // android.widget.ImageView, android.view.View, android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        Drawable drawable2 = getDrawable();
        iot iotVar = this.v;
        if (drawable2 == iotVar) {
            super.invalidateDrawable(iotVar);
        } else {
            super.invalidateDrawable(drawable);
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (isInEditMode() || !this.A) {
            return;
        }
        this.v.l();
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        int i;
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.w = savedState.a;
        HashSet hashSet = this.C;
        a aVar = a.a;
        if (!hashSet.contains(aVar) && !TextUtils.isEmpty(this.w)) {
            setAnimation(this.w);
        }
        this.y = savedState.b;
        if (!hashSet.contains(aVar) && (i = this.y) != 0) {
            setAnimation(i);
        }
        boolean zContains = hashSet.contains(a.b);
        iot iotVar = this.v;
        if (!zContains) {
            iotVar.y(savedState.c);
        }
        a aVar2 = a.f;
        if (!hashSet.contains(aVar2) && savedState.d) {
            hashSet.add(aVar2);
            iotVar.l();
        }
        if (!hashSet.contains(a.e)) {
            setImageAssetsFolder(savedState.e);
        }
        if (!hashSet.contains(a.c)) {
            setRepeatMode(savedState.f);
        }
        if (hashSet.contains(a.d)) {
            return;
        }
        setRepeatCount(savedState.i);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        boolean z;
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.a = this.w;
        savedState.b = this.y;
        iot iotVar = this.v;
        bpt bptVar = iotVar.b;
        bpt bptVar2 = iotVar.b;
        savedState.c = bptVar.d();
        if (iotVar.isVisible()) {
            z = bptVar2.B;
        } else {
            iot.b bVar = iotVar.f;
            z = bVar == iot.b.b || bVar == iot.b.c;
        }
        savedState.d = z;
        savedState.e = iotVar.w;
        savedState.f = bptVar2.getRepeatMode();
        savedState.i = bptVar2.getRepeatCount();
        return savedState;
    }

    public void setAnimation(final String str) {
        yot<xmt> yotVarA;
        this.w = str;
        this.y = 0;
        if (isInEditMode()) {
            yotVarA = new yot<>(new Callable() { // from class: rmt
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    smt smtVar = LottieAnimationView.F;
                    LottieAnimationView lottieAnimationView = this.a;
                    boolean z = lottieAnimationView.B;
                    String str2 = str;
                    if (!z) {
                        return lnt.c(lottieAnimationView.getContext(), str2, null);
                    }
                    Context context = lottieAnimationView.getContext();
                    HashMap map = lnt.a;
                    return lnt.c(context, str2, "asset_" + str2);
                }
            }, true);
        } else if (this.B) {
            yotVarA = lnt.b(getContext(), str);
        } else {
            Context context = getContext();
            HashMap map = lnt.a;
            yotVarA = lnt.a(null, new fnt(context.getApplicationContext(), str, null), null);
        }
        setCompositionTask(yotVarA);
    }

    public void setAnimationFromJson(String str, String str2) {
        setAnimation(new ByteArrayInputStream(str.getBytes()), str2);
    }

    public void setAnimationFromUrl(String str) {
        setCompositionTask(this.B ? lnt.i(getContext(), str) : lnt.a(null, new zmt(getContext(), str, null), null));
    }

    public void setApplyingOpacityToLayersEnabled(boolean z) {
        this.v.I = z;
    }

    public void setApplyingShadowToLayersEnabled(boolean z) {
        this.v.J = z;
    }

    public void setAsyncUpdates(b11 b11Var) {
        this.v.b0 = b11Var;
    }

    public void setCacheComposition(boolean z) {
        this.B = z;
    }

    public void setClipTextToBoundingBox(boolean z) {
        iot iotVar = this.v;
        if (z != iotVar.K) {
            iotVar.K = z;
            iotVar.invalidateSelf();
        }
    }

    public void setClipToCompositionBounds(boolean z) {
        iot iotVar = this.v;
        if (z != iotVar.D) {
            iotVar.D = z;
            wma wmaVar = iotVar.E;
            if (wmaVar != null) {
                wmaVar.L = z;
            }
            iotVar.invalidateSelf();
        }
    }

    public void setComposition(xmt xmtVar) {
        iot iotVar = this.v;
        iotVar.setCallback(this);
        this.z = true;
        boolean zO = iotVar.o(xmtVar);
        if (this.A) {
            iotVar.l();
        }
        this.z = false;
        if (getDrawable() != iotVar || zO) {
            if (!zO) {
                bpt bptVar = iotVar.b;
                boolean z = bptVar != null ? bptVar.B : false;
                setImageDrawable(null);
                setImageDrawable(iotVar);
                if (z) {
                    iotVar.n();
                }
            }
            onVisibilityChanged(this, getVisibility());
            requestLayout();
            Iterator it = this.D.iterator();
            while (it.hasNext()) {
                ((uot) it.next()).a();
            }
        }
    }

    public void setDefaultFontFileExtension(String str) {
        c8i c8iVar;
        iot iotVar = this.v;
        iotVar.A = str;
        if (iotVar.getCallback() == null) {
            c8iVar = null;
        } else {
            c8i c8iVar2 = iotVar.y;
            if (c8iVar2 == null) {
                c8iVar2 = new c8i(iotVar.getCallback());
                iotVar.y = c8iVar2;
                String str2 = iotVar.A;
                if (str2 != null) {
                    c8iVar2.e = str2;
                }
            }
            c8iVar = c8iVar2;
        }
        if (c8iVar != null) {
            c8iVar.e = str;
        }
    }

    public void setFailureListener(qot<Throwable> qotVar) {
        this.f = qotVar;
    }

    public void setFallbackResource(int i) {
        this.i = i;
    }

    public void setFontAssetDelegate(b8i b8iVar) {
        c8i c8iVar = this.v.y;
    }

    public void setFontMap(Map<String, Typeface> map) {
        iot iotVar = this.v;
        if (map == iotVar.z) {
            return;
        }
        iotVar.z = map;
        iotVar.invalidateSelf();
    }

    public void setFrame(int i) {
        this.v.p(i);
    }

    @Deprecated
    public void setIgnoreDisabledSystemAnimations(boolean z) {
        this.v.d = z;
    }

    public void setImageAssetDelegate(a8n a8nVar) {
        b8n b8nVar = this.v.v;
    }

    public void setImageAssetsFolder(String str) {
        this.v.w = str;
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        this.y = 0;
        this.w = null;
        c();
        super.setImageBitmap(bitmap);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        this.y = 0;
        this.w = null;
        c();
        super.setImageDrawable(drawable);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageResource(int i) {
        this.y = 0;
        this.w = null;
        c();
        super.setImageResource(i);
    }

    public void setMaintainOriginalImageBounds(boolean z) {
        this.v.C = z;
    }

    public void setMaxFrame(int i) {
        this.v.q(i);
    }

    public void setMaxProgress(float f) {
        iot iotVar = this.v;
        xmt xmtVar = iotVar.a;
        if (xmtVar == null) {
            iotVar.i.add(new xnt(iotVar, f));
            return;
        }
        bpt bptVar = iotVar.b;
        bptVar.j(bptVar.y, rqv.f(xmtVar.l, xmtVar.m, f));
    }

    public void setMinAndMaxFrame(String str) {
        this.v.t(str);
    }

    public void setMinAndMaxProgress(float f, float f2) {
        this.v.v(f, f2);
    }

    public void setMinFrame(int i) {
        this.v.w(i);
    }

    public void setMinProgress(float f) {
        iot iotVar = this.v;
        xmt xmtVar = iotVar.a;
        if (xmtVar == null) {
            iotVar.i.add(new got(iotVar, f));
        } else {
            iotVar.w((int) rqv.f(xmtVar.l, xmtVar.m, f));
        }
    }

    public void setOutlineMasksAndMattes(boolean z) {
        iot iotVar = this.v;
        if (iotVar.H == z) {
            return;
        }
        iotVar.H = z;
        wma wmaVar = iotVar.E;
        if (wmaVar != null) {
            wmaVar.s(z);
        }
    }

    public void setPerformanceTrackingEnabled(boolean z) {
        iot iotVar = this.v;
        iotVar.G = z;
        xmt xmtVar = iotVar.a;
        if (xmtVar != null) {
            xmtVar.a.a = z;
        }
    }

    public void setProgress(float f) {
        this.C.add(a.b);
        this.v.y(f);
    }

    public void setRenderMode(v750 v750Var) {
        iot iotVar = this.v;
        iotVar.L = v750Var;
        iotVar.e();
    }

    public void setRepeatCount(int i) {
        this.C.add(a.d);
        this.v.b.setRepeatCount(i);
    }

    public void setRepeatMode(int i) {
        this.C.add(a.c);
        this.v.b.setRepeatMode(i);
    }

    public void setSafeMode(boolean z) {
        this.v.e = z;
    }

    public void setSpeed(float f) {
        this.v.b.d = f;
    }

    public void setTextDelegate(aff0 aff0Var) {
        this.v.getClass();
    }

    public void setUseCompositionFrameRate(boolean z) {
        this.v.b.C = z;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0019  */
    /* JADX WARN: Code duplicated, block: B:18:0x0027  */
    /* JADX WARN: Code duplicated, block: B:20:0x002b  */
    @Override // android.view.View
    public final void unscheduleDrawable(Drawable drawable) {
        iot iotVar;
        bpt bptVar;
        iot iotVar2;
        boolean z = this.z;
        if (!z && drawable == (iotVar2 = this.v)) {
            bpt bptVar2 = iotVar2.b;
            if (bptVar2 == null ? false : bptVar2.B) {
                this.A = false;
                iotVar2.k();
            } else if (!z) {
                iotVar = (iot) drawable;
                bptVar = iotVar.b;
                if (bptVar != null ? bptVar.B : false) {
                    iotVar.k();
                }
            }
        } else if (!z && (drawable instanceof iot)) {
            iotVar = (iot) drawable;
            bptVar = iotVar.b;
            if (bptVar != null ? bptVar.B : false) {
                iotVar.k();
            }
        }
        super.unscheduleDrawable(drawable);
    }

    public void setMaxFrame(String str) {
        this.v.r(str);
    }

    public void setMinAndMaxFrame(String str, String str2, boolean z) {
        this.v.u(str, str2, z);
    }

    public void setMinFrame(String str) {
        this.v.x(str);
    }

    public void setMinAndMaxFrame(int i, int i2) {
        this.v.s(i, i2);
    }

    @Deprecated
    public void setAnimationFromJson(String str) {
        setAnimationFromJson(str, null);
    }

    public void setAnimationFromUrl(String str, String str2) {
        setCompositionTask(lnt.a(str2, new zmt(getContext(), str, str2), null));
    }

    public LottieAnimationView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.d = new c(this);
        this.e = new b(this);
        this.i = 0;
        this.v = new iot();
        this.z = false;
        this.A = false;
        this.B = true;
        this.C = new HashSet();
        this.D = new HashSet();
        d(attributeSet, R.attr.lottieAnimationViewStyle);
    }

    public void setAnimation(final int i) {
        yot<xmt> yotVarG;
        this.y = i;
        this.w = null;
        if (isInEditMode()) {
            yotVarG = new yot<>(new Callable() { // from class: tmt
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    smt smtVar = LottieAnimationView.F;
                    LottieAnimationView lottieAnimationView = this.a;
                    boolean z = lottieAnimationView.B;
                    int i2 = i;
                    if (!z) {
                        return lnt.h(i2, lottieAnimationView.getContext(), null);
                    }
                    Context context = lottieAnimationView.getContext();
                    return lnt.h(i2, context, lnt.n(context, i2));
                }
            }, true);
        } else if (this.B) {
            Context context = getContext();
            yotVarG = lnt.g(i, context, lnt.n(context, i));
        } else {
            yotVarG = lnt.g(i, getContext(), null);
        }
        setCompositionTask(yotVarG);
    }

    public LottieAnimationView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.d = new c(this);
        this.e = new b(this);
        this.i = 0;
        this.v = new iot();
        this.z = false;
        this.A = false;
        this.B = true;
        this.C = new HashSet();
        this.D = new HashSet();
        d(attributeSet, i);
    }

    public void setAnimation(final InputStream inputStream, final String str) {
        setCompositionTask(lnt.a(str, new Callable() { // from class: bnt
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return lnt.f(tmy.c(inputStream), str);
            }
        }, new Runnable() { // from class: cnt
            @Override // java.lang.Runnable
            public final void run() {
                srh0.b(inputStream);
            }
        }));
    }

    public void setAnimation(final ZipInputStream zipInputStream, final String str) {
        setCompositionTask(lnt.a(str, new Callable() { // from class: dnt
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return lnt.j(null, zipInputStream, str);
            }
        }, new Runnable() { // from class: ent
            @Override // java.lang.Runnable
            public final void run() {
                srh0.b(zipInputStream);
            }
        }));
    }
}
