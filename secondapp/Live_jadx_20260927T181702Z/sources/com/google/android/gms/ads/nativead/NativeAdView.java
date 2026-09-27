package com.google.android.gms.ads.nativead;

import android.content.Context;
import android.os.RemoteException;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.MediaContent;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzfb;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbie;
import com.google.android.gms.internal.ads.zzble;
import com.google.android.gms.internal.ads.zzblg;
import com.google.android.gms.internal.ads.zzblw;
import qx.c;
import ux.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
public final class NativeAdView extends FrameLayout {

    @c
    private final FrameLayout zza;

    @Nullable
    @c
    private final zzblw zzb;

    public NativeAdView(@NonNull Context context) {
        super(context);
        this.zza = zze(context);
        this.zzb = zzf();
    }

    private final void zzd(String str, @Nullable View view) {
        zzblw zzblwVar = this.zzb;
        if (zzblwVar == null) {
            return;
        }
        try {
            zzblwVar.zzb(str, ObjectWrapper.wrap(view));
        } catch (RemoteException e10) {
            zzo.zzg("Unable to call setAssetView on delegate", e10);
        }
    }

    private final FrameLayout zze(Context context) {
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        addView(frameLayout);
        return frameLayout;
    }

    @Nullable
    @m({"overlayFrame"})
    private final zzblw zzf() {
        if (isInEditMode()) {
            return null;
        }
        FrameLayout frameLayout = this.zza;
        return zzay.zzb().zze(frameLayout.getContext(), this, frameLayout);
    }

    @Override // android.view.ViewGroup
    public final void addView(@NonNull View view, int i10, @NonNull ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i10, layoutParams);
        super.bringChildToFront(this.zza);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void bringChildToFront(@NonNull View view) {
        super.bringChildToFront(view);
        FrameLayout frameLayout = this.zza;
        if (frameLayout != view) {
            super.bringChildToFront(frameLayout);
        }
    }

    public void destroy() {
        zzblw zzblwVar = this.zzb;
        if (zzblwVar == null) {
            return;
        }
        try {
            zzblwVar.zze();
        } catch (RemoteException e10) {
            zzo.zzg("Unable to destroy native ad view", e10);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(@NonNull MotionEvent motionEvent) {
        zzblw zzblwVar = this.zzb;
        if (zzblwVar != null) {
            if (((Boolean) zzba.zzc().zzd(zzbie.zzmW)).booleanValue()) {
                try {
                    zzblwVar.zzdD(ObjectWrapper.wrap(motionEvent));
                } catch (RemoteException e10) {
                    zzo.zzg("Unable to call handleTouchEvent on delegate", e10);
                }
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Nullable
    public AdChoicesView getAdChoicesView() {
        View viewZza = zza("3011");
        if (viewZza instanceof AdChoicesView) {
            return (AdChoicesView) viewZza;
        }
        return null;
    }

    @Nullable
    public final View getAdvertiserView() {
        return zza("3005");
    }

    @Nullable
    public final View getBodyView() {
        return zza("3004");
    }

    @Nullable
    public final View getCallToActionView() {
        return zza("3002");
    }

    @Nullable
    public final View getHeadlineView() {
        return zza("3001");
    }

    @Nullable
    public final View getIconView() {
        return zza("3003");
    }

    @Nullable
    public final View getImageView() {
        return zza("3008");
    }

    @Nullable
    public final MediaView getMediaView() {
        View viewZza = zza("3010");
        if (viewZza instanceof MediaView) {
            return (MediaView) viewZza;
        }
        if (viewZza == null) {
            return null;
        }
        zzo.zzd("View is not an instance of MediaView");
        return null;
    }

    @Nullable
    public final View getPriceView() {
        return zza("3007");
    }

    @Nullable
    public final View getStarRatingView() {
        return zza("3009");
    }

    @Nullable
    public final View getStoreView() {
        return zza("3006");
    }

    @Override // android.view.View
    public final void onVisibilityChanged(@NonNull View view, int i10) {
        super.onVisibilityChanged(view, i10);
        zzblw zzblwVar = this.zzb;
        if (zzblwVar == null) {
            return;
        }
        try {
            zzblwVar.zzf(ObjectWrapper.wrap(view), i10);
        } catch (RemoteException e10) {
            zzo.zzg("Unable to call onVisibilityChanged on delegate", e10);
        }
    }

    @Override // android.view.ViewGroup
    public final void removeAllViews() {
        super.removeAllViews();
        super.addView(this.zza);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(@NonNull View view) {
        if (this.zza == view) {
            return;
        }
        super.removeView(view);
    }

    public void setAdChoicesView(@Nullable AdChoicesView adChoicesView) {
        zzd("3011", adChoicesView);
    }

    public final void setAdvertiserView(@Nullable View view) {
        zzd("3005", view);
    }

    public final void setBodyView(@Nullable View view) {
        zzd("3004", view);
    }

    public final void setCallToActionView(@Nullable View view) {
        zzd("3002", view);
    }

    public final void setClickConfirmingView(@Nullable View view) {
        zzblw zzblwVar = this.zzb;
        if (zzblwVar == null) {
            return;
        }
        try {
            zzblwVar.zzdB(ObjectWrapper.wrap(view));
        } catch (RemoteException e10) {
            zzo.zzg("Unable to call setClickConfirmingView on delegate", e10);
        }
    }

    public final void setHeadlineView(@Nullable View view) {
        zzd("3001", view);
    }

    public final void setIconView(@Nullable View view) {
        zzd("3003", view);
    }

    public final void setImageView(@Nullable View view) {
        zzd("3008", view);
    }

    public final void setMediaView(@Nullable MediaView mediaView) {
        zzd("3010", mediaView);
        if (mediaView == null) {
            return;
        }
        mediaView.zza(new zzble() { // from class: com.google.android.gms.ads.nativead.zzb
            @Override // com.google.android.gms.internal.ads.zzble
            public final /* synthetic */ void zza(MediaContent mediaContent) {
                this.zza.zzb(mediaContent);
            }
        });
        mediaView.zzb(new zzblg() { // from class: com.google.android.gms.ads.nativead.zza
            @Override // com.google.android.gms.internal.ads.zzblg
            public final /* synthetic */ void zza(ImageView.ScaleType scaleType) {
                this.zza.zzc(scaleType);
            }
        });
    }

    public void setNativeAd(@NonNull NativeAd nativeAd) {
        zzblw zzblwVar = this.zzb;
        if (zzblwVar == null) {
            return;
        }
        try {
            zzblwVar.zzd((IObjectWrapper) nativeAd.zza());
        } catch (RemoteException e10) {
            zzo.zzg("Unable to call setNativeAd on delegate", e10);
        }
    }

    public final void setPriceView(@Nullable View view) {
        zzd("3007", view);
    }

    public final void setStarRatingView(@Nullable View view) {
        zzd("3009", view);
    }

    public final void setStoreView(@Nullable View view) {
        zzd("3006", view);
    }

    @Nullable
    public final View zza(@NonNull String str) {
        zzblw zzblwVar = this.zzb;
        if (zzblwVar != null) {
            try {
                IObjectWrapper iObjectWrapperZzc = zzblwVar.zzc(str);
                if (iObjectWrapperZzc != null) {
                    return (View) ObjectWrapper.unwrap(iObjectWrapperZzc);
                }
            } catch (RemoteException e10) {
                zzo.zzg("Unable to call getAssetView on delegate", e10);
            }
        }
        return null;
    }

    public final /* synthetic */ void zzb(MediaContent mediaContent) {
        zzblw zzblwVar = this.zzb;
        if (zzblwVar == null) {
            return;
        }
        try {
            if (mediaContent instanceof zzfb) {
                zzblwVar.zzdE(((zzfb) mediaContent).zzc());
            } else if (mediaContent == null) {
                zzblwVar.zzdE(null);
            } else {
                zzo.zzd("Use MediaContent provided by NativeAd.getMediaContent");
            }
        } catch (RemoteException e10) {
            zzo.zzg("Unable to call setMediaContent on delegate", e10);
        }
    }

    public final /* synthetic */ void zzc(ImageView.ScaleType scaleType) {
        zzblw zzblwVar = this.zzb;
        if (zzblwVar == null || scaleType == null) {
            return;
        }
        try {
            zzblwVar.zzdC(ObjectWrapper.wrap(scaleType));
        } catch (RemoteException e10) {
            zzo.zzg("Unable to call setMediaViewImageScaleType on delegate", e10);
        }
    }

    public NativeAdView(@NonNull Context context, @NonNull AttributeSet attributeSet) {
        super(context, attributeSet);
        this.zza = zze(context);
        this.zzb = zzf();
    }

    public NativeAdView(@NonNull Context context, @NonNull AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.zza = zze(context);
        this.zzb = zzf();
    }

    public NativeAdView(@NonNull Context context, @NonNull AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        this.zza = zze(context);
        this.zzb = zzf();
    }
}
