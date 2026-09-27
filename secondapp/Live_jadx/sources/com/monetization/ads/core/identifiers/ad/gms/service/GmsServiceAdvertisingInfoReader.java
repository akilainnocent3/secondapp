package com.monetization.ads.core.identifiers.ad.gms.service;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.tiktok.appevents.e0;
import oy.l;
import oy.m;
import yads.ad1;
import yads.ce;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class GmsServiceAdvertisingInfoReader implements ce, IInterface {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final IBinder f71780a;

    public GmsServiceAdvertisingInfoReader(@l IBinder iBinder) {
        this.f71780a = iBinder;
    }

    @Override // android.os.IInterface
    @l
    public IBinder asBinder() {
        return this.f71780a;
    }

    @Override // yads.ce
    @m
    public Boolean readAdTrackingLimited() {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            try {
                parcelObtain.writeInterfaceToken(e0.d.f76070c);
                boolean z10 = true;
                parcelObtain.writeInt(1);
                this.f71780a.transact(2, parcelObtain, parcelObtain2, 0);
                parcelObtain2.readException();
                if (parcelObtain2.readInt() == 0) {
                    z10 = false;
                }
                Boolean boolValueOf = Boolean.valueOf(z10);
                parcelObtain2.recycle();
                parcelObtain.recycle();
                return boolValueOf;
            } finally {
                parcelObtain2.recycle();
                parcelObtain.recycle();
            }
        } catch (Throwable unused) {
            boolean z11 = ad1.f146762a;
            return null;
        }
    }

    @Override // yads.ce
    @m
    public String readAdvertisingId() {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            try {
                parcelObtain.writeInterfaceToken(e0.d.f76070c);
                this.f71780a.transact(1, parcelObtain, parcelObtain2, 0);
                parcelObtain2.readException();
                String string = parcelObtain2.readString();
                parcelObtain2.recycle();
                parcelObtain.recycle();
                return string;
            } catch (Throwable unused) {
                boolean z10 = ad1.f146762a;
                return null;
            }
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }
}
