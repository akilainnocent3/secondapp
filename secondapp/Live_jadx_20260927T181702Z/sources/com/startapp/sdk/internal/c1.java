package com.startapp.sdk.internal;

import android.R;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Point;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.TypedValue;
import android.view.View;
import android.widget.RelativeLayout;
import com.startapp.sdk.ads.banner.BannerOptions;
import com.startapp.sdk.ads.banner.banner3d.Banner3D;
import com.startapp.sdk.ads.banner.banner3d.Banner3DView;
import com.startapp.sdk.adsbase.commontracking.TrackingParams;
import com.startapp.sdk.adsbase.model.AdDetails;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class c1 implements i2, Parcelable {
    public static final Parcelable.Creator<c1> CREATOR = new b1();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AdDetails f74613a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Point f74614b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Bitmap f74615c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Bitmap f74616d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AtomicBoolean f74617e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final TrackingParams f74618f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public xf f74619g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Banner3DView f74620h;

    public c1(Context context, Banner3D banner3D, AdDetails adDetails, BannerOptions bannerOptions, TrackingParams trackingParams) {
        this.f74615c = null;
        this.f74616d = null;
        this.f74617e = new AtomicBoolean(false);
        this.f74619g = null;
        this.f74620h = null;
        this.f74613a = adDetails;
        this.f74618f = trackingParams;
        a(context, bannerOptions, banner3D);
    }

    public final void a(Context context, BannerOptions bannerOptions, Banner3D banner3D) {
        int iA = ii.a(context, bannerOptions.d() - 5);
        this.f74614b = new Point((int) (bannerOptions.p() * Math.round(TypedValue.applyDimension(1, bannerOptions.o(), context.getResources().getDisplayMetrics()))), (int) (bannerOptions.e() * Math.round(TypedValue.applyDimension(1, bannerOptions.d(), context.getResources().getDisplayMetrics()))));
        Banner3DView banner3DView = new Banner3DView(context, new Point(bannerOptions.o(), bannerOptions.d()));
        this.f74620h = banner3DView;
        banner3DView.setText(this.f74613a.x());
        this.f74620h.setRating(this.f74613a.u());
        this.f74620h.setDescription(this.f74613a.j());
        this.f74620h.setButtonText(this.f74613a.C());
        Bitmap bitmap = this.f74615c;
        if (bitmap != null) {
            this.f74620h.setImage(bitmap, iA, iA);
        } else {
            this.f74620h.setImage(R.drawable.sym_def_app_icon, iA, iA);
            new j2(context, this.f74613a.m(), this, 0).a();
        }
        Point point = this.f74614b;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(point.x, point.y);
        layoutParams.addRule(13);
        banner3D.addView(this.f74620h, layoutParams);
        this.f74620h.setVisibility(8);
        a();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeParcelable(this.f74613a, i10);
        parcel.writeInt(this.f74614b.x);
        parcel.writeInt(this.f74614b.y);
        parcel.writeParcelable(this.f74615c, i10);
        parcel.writeBooleanArray(new boolean[]{this.f74617e.get()});
        parcel.writeSerializable(this.f74618f);
    }

    public c1(Parcel parcel) {
        this.f74615c = null;
        this.f74616d = null;
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        this.f74617e = atomicBoolean;
        this.f74619g = null;
        this.f74620h = null;
        this.f74613a = (AdDetails) parcel.readParcelable(AdDetails.class.getClassLoader());
        Point point = new Point(1, 1);
        this.f74614b = point;
        point.x = parcel.readInt();
        this.f74614b.y = parcel.readInt();
        this.f74615c = (Bitmap) parcel.readParcelable(Bitmap.class.getClassLoader());
        boolean[] zArr = new boolean[1];
        parcel.readBooleanArray(zArr);
        atomicBoolean.set(zArr[0]);
        this.f74618f = (TrackingParams) parcel.readSerializable();
    }

    public final void a() {
        Bitmap bitmapA;
        Point point;
        int i10;
        int i11;
        Banner3DView banner3DView = this.f74620h;
        if (banner3DView != null) {
            try {
                bitmapA = a(banner3DView);
            } catch (OutOfMemoryError unused) {
                bitmapA = null;
            } catch (Throwable th2) {
                d9.a(th2);
                bitmapA = null;
            }
        } else {
            bitmapA = null;
        }
        this.f74616d = bitmapA;
        if (bitmapA != null && (i10 = (point = this.f74614b).x) > 0 && (i11 = point.y) > 0) {
            this.f74616d = Bitmap.createScaledBitmap(bitmapA, i10, i11, false);
        }
    }

    public static Bitmap a(View view) {
        view.measure(view.getMeasuredWidth(), view.getMeasuredHeight());
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(view.getMeasuredWidth(), view.getMeasuredHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        view.layout(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
        view.draw(canvas);
        return bitmapCreateBitmap;
    }

    @Override // com.startapp.sdk.internal.i2
    public final void a(Bitmap bitmap, int i10) {
        Banner3DView banner3DView;
        if (bitmap == null || (banner3DView = this.f74620h) == null) {
            return;
        }
        this.f74615c = bitmap;
        banner3DView.setImage(bitmap);
        a();
    }
}
