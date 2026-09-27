package com.yandex.div.evaluable.types;

import ds.a;
import java.util.Calendar;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.s1;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
@s1({"SMAP\nDateTime.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DateTime.kt\ncom/yandex/div/evaluable/types/DateTime$calendar$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,57:1\n1#2:58\n*E\n"})
public final class DateTime$calendar$2 extends o0 implements a<Calendar> {
    final /* synthetic */ DateTime this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DateTime$calendar$2(DateTime dateTime) {
        super(0);
        this.this$0 = dateTime;
    }

    @Override // ds.a
    public final Calendar invoke() {
        Calendar calendar = Calendar.getInstance(DateTime.utcTimezone);
        calendar.setTimeInMillis(this.this$0.getTimestampMillis$div_evaluable());
        return calendar;
    }
}
