package com.yandex.div.storage.database;

import android.database.Cursor;
import com.yandex.div.internal.util.IOUtils;
import cr.c;
import dr.w2;
import java.io.Closeable;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.x;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class ReadState implements Closeable {

    @m
    private Cursor _cursor;

    @l
    private final c<Cursor> cursorProvider;

    @l
    private final ds.a<w2> onCloseState;

    /* JADX INFO: renamed from: com.yandex.div.storage.database.ReadState$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class AnonymousClass1 extends o0 implements ds.a<w2> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(0);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
        }

        @Override // ds.a
        public /* bridge */ /* synthetic */ w2 invoke() {
            invoke2();
            return w2.f79517a;
        }
    }

    public ReadState(@l ds.a<w2> aVar, @l c<Cursor> cVar) {
        this.onCloseState = aVar;
        this.cursorProvider = cVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        IOUtils.closeCursorSilently(this._cursor);
        this.onCloseState.invoke();
    }

    @l
    public final Cursor getCursor() {
        if (this._cursor != null) {
            throw new RuntimeException("Cursor should be called only once");
        }
        Cursor cursor = this.cursorProvider.get();
        this._cursor = cursor;
        return cursor;
    }

    public /* synthetic */ ReadState(ds.a aVar, c cVar, int i10, x xVar) {
        this((i10 & 1) != 0 ? AnonymousClass1.INSTANCE : aVar, cVar);
    }
}
