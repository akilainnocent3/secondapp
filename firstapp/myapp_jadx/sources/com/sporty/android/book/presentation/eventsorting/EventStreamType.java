package com.sporty.android.book.presentation.eventsorting;

import com.sportybet.android.gp.tz.R;
import defpackage.om2;
import defpackage.tag;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0017\b\u0002\u0012\f\b\u0001\u0010\u0002\u001a\u00020\u0003:\u0002\b\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u001b\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u0092\u0002\u0002\b\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nÊ\u0001\u0002\b\f¨\u0006\u000b"}, d2 = {"Lcom/sporty/android/book/presentation/eventsorting/EventStreamType;", "", "textRes", "", "Landroidx/annotation/StringRes;", "<init>", "(Ljava/lang/String;II)V", "getTextRes", "()I", "SPORTY_TV", "SPORTY_FM", "sportybook", "Landroidx/annotation/Keep;"}, k = 1, mv = {2, 4, 0}, xi = 48)
public enum EventStreamType {
    SPORTY_TV(R.string.live__sportytv),
    SPORTY_FM(R.string.live__sportyfm);

    private static final /* synthetic */ tag $ENTRIES = om2.a(values());
    private final int textRes;

    EventStreamType(int i) {
        this.textRes = i;
    }

    public static tag<EventStreamType> getEntries() {
        return $ENTRIES;
    }

    public final int getTextRes() {
        return this.textRes;
    }
}
