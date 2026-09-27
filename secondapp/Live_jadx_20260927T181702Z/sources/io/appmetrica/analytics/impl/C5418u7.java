package io.appmetrica.analytics.impl;

import android.content.ContentValues;
import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.protobuf.nano.MessageNano;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.u7, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class C5418u7 implements Converter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C5343r7 f98402a;

    /* JADX WARN: Multi-variable type inference failed */
    public C5418u7() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @oy.l
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final ContentValues fromModel(@oy.l C5393t7 c5393t7) {
        ContentValues contentValues = new ContentValues();
        Long l10 = c5393t7.f98345a;
        if (l10 != null) {
            contentValues.put("id", Long.valueOf(l10.longValue()));
        }
        Wk wk2 = c5393t7.f98346b;
        if (wk2 != null) {
            contentValues.put("type", Integer.valueOf(wk2.f96715a));
        }
        String str = c5393t7.f98347c;
        if (str != null) {
            contentValues.put("report_request_parameters", str);
        }
        C5343r7 c5343r7 = this.f98402a;
        contentValues.put("session_description", MessageNano.toByteArray(c5343r7.f98223a.fromModel(c5393t7.f98348d)));
        return contentValues;
    }

    public C5418u7(@oy.l C5343r7 c5343r7) {
        this.f98402a = c5343r7;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ C5418u7(C5343r7 c5343r7, int i10, kotlin.jvm.internal.x xVar) {
        this((i10 & 1) != 0 ? new C5343r7(null, 1, 0 == true ? 1 : 0) : c5343r7);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @oy.l
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5393t7 toModel(@oy.l ContentValues contentValues) {
        Wk wk2;
        Long asLong = contentValues.getAsLong("id");
        Integer asInteger = contentValues.getAsInteger("type");
        if (asInteger != null) {
            int iIntValue = asInteger.intValue();
            wk2 = Wk.FOREGROUND;
            if (iIntValue != 0 && iIntValue == 1) {
                wk2 = Wk.BACKGROUND;
            }
        } else {
            wk2 = null;
        }
        return new C5393t7(asLong, wk2, contentValues.getAsString("report_request_parameters"), this.f98402a.toModel(contentValues.getAsByteArray("session_description")));
    }
}
