package com.sportybet.android.basepay.data;

import android.content.Context;
import defpackage.d630;
import defpackage.n340;
import defpackage.ohp;
import defpackage.sqc;
import defpackage.v8b;
import defpackage.zn20;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\"%\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u00008BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Landroid/content/Context;", "Lsqc;", "Lzn20;", "dataStore$delegate", "Ln340;", "getDataStore", "(Landroid/content/Context;)Lsqc;", "dataStore", "africa-bet-android"}, k = 2, mv = {2, 4, 0}, xi = 48)
public final class NewFeatureAlertDataStoreImplKt {
    static final /* synthetic */ ohp<Object>[] $$delegatedProperties = {new d630(1, NewFeatureAlertDataStoreImplKt.class, "dataStore", "getDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;")};
    private static final n340 dataStore$delegate = v8b.a(14, NewFeatureAlertDataStoreImpl.PREFERENCE_NAME, null);

    /* JADX INFO: Access modifiers changed from: private */
    public static final sqc<zn20> getDataStore(Context context) {
        return (sqc) dataStore$delegate.a(context, $$delegatedProperties[0]);
    }
}
