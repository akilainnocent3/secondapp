package com.yandex.div.internal;

import kotlin.jvm.internal.o0;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class KAssert {

    @l
    public static final KAssert INSTANCE = new KAssert();

    /* JADX INFO: renamed from: com.yandex.div.internal.KAssert$assertEquals$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class AnonymousClass1 extends o0 implements ds.a<String> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(0);
        }

        @Override // ds.a
        @l
        public final String invoke() {
            return "";
        }
    }

    /* JADX INFO: renamed from: com.yandex.div.internal.KAssert$assertFalse$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class C48541 extends o0 implements ds.a<String> {
        public static final C48541 INSTANCE = new C48541();

        public C48541() {
            super(0);
        }

        @Override // ds.a
        @l
        public final String invoke() {
            return "";
        }
    }

    /* JADX INFO: renamed from: com.yandex.div.internal.KAssert$assertFalse$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class AnonymousClass2 extends o0 implements ds.a<String> {
        public static final AnonymousClass2 INSTANCE = new AnonymousClass2();

        public AnonymousClass2() {
            super(0);
        }

        @Override // ds.a
        @l
        public final String invoke() {
            return "";
        }
    }

    /* JADX INFO: renamed from: com.yandex.div.internal.KAssert$assertNotNull$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class C48551 extends o0 implements ds.a<String> {
        public static final C48551 INSTANCE = new C48551();

        public C48551() {
            super(0);
        }

        @Override // ds.a
        @l
        public final String invoke() {
            return "";
        }
    }

    /* JADX INFO: renamed from: com.yandex.div.internal.KAssert$assertNotSame$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class C48561 extends o0 implements ds.a<String> {
        public static final C48561 INSTANCE = new C48561();

        public C48561() {
            super(0);
        }

        @Override // ds.a
        @l
        public final String invoke() {
            return "";
        }
    }

    /* JADX INFO: renamed from: com.yandex.div.internal.KAssert$assertNull$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class C48571 extends o0 implements ds.a<String> {
        public static final C48571 INSTANCE = new C48571();

        public C48571() {
            super(0);
        }

        @Override // ds.a
        @l
        public final String invoke() {
            return "";
        }
    }

    /* JADX INFO: renamed from: com.yandex.div.internal.KAssert$assertSame$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class C48581 extends o0 implements ds.a<String> {
        public static final C48581 INSTANCE = new C48581();

        public C48581() {
            super(0);
        }

        @Override // ds.a
        @l
        public final String invoke() {
            return "";
        }
    }

    /* JADX INFO: renamed from: com.yandex.div.internal.KAssert$assertTrue$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class C48591 extends o0 implements ds.a<String> {
        public static final C48591 INSTANCE = new C48591();

        public C48591() {
            super(0);
        }

        @Override // ds.a
        @l
        public final String invoke() {
            return "";
        }
    }

    /* JADX INFO: renamed from: com.yandex.div.internal.KAssert$assertTrue$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class C48602 extends o0 implements ds.a<String> {
        public static final C48602 INSTANCE = new C48602();

        public C48602() {
            super(0);
        }

        @Override // ds.a
        @l
        public final String invoke() {
            return "";
        }
    }

    /* JADX INFO: renamed from: com.yandex.div.internal.KAssert$fail$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class C48611 extends o0 implements ds.a<String> {
        public static final C48611 INSTANCE = new C48611();

        public C48611() {
            super(0);
        }

        @Override // ds.a
        @l
        public final String invoke() {
            return "";
        }
    }

    private KAssert() {
    }

    public static /* synthetic */ void assertEquals$default(KAssert kAssert, Object obj, Object obj2, ds.a aVar, int i10, Object obj3) {
        if ((i10 & 4) != 0) {
            aVar = AnonymousClass1.INSTANCE;
        }
        if (Assert.isEnabled()) {
            Assert.assertEquals((String) aVar.invoke(), obj, obj2);
        }
    }

    public static /* synthetic */ void assertFalse$default(KAssert kAssert, boolean z10, ds.a aVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            aVar = C48541.INSTANCE;
        }
        if (Assert.isEnabled() && z10) {
            Assert.fail((String) aVar.invoke());
        }
    }

    public static /* synthetic */ void assertNotNull$default(KAssert kAssert, Object obj, ds.a aVar, int i10, Object obj2) {
        if ((i10 & 2) != 0) {
            aVar = C48551.INSTANCE;
        }
        if (Assert.isEnabled() && obj == null) {
            Assert.fail((String) aVar.invoke());
        }
    }

    public static /* synthetic */ void assertNotSame$default(KAssert kAssert, Object obj, Object obj2, ds.a aVar, int i10, Object obj3) {
        if ((i10 & 4) != 0) {
            aVar = C48561.INSTANCE;
        }
        if (Assert.isEnabled()) {
            Assert.assertNotSame((String) aVar.invoke(), obj, obj2);
        }
    }

    public static /* synthetic */ void assertNull$default(KAssert kAssert, Object obj, ds.a aVar, int i10, Object obj2) {
        if ((i10 & 2) != 0) {
            aVar = C48571.INSTANCE;
        }
        if (!Assert.isEnabled() || obj == null) {
            return;
        }
        Assert.fail((String) aVar.invoke());
    }

    public static /* synthetic */ void assertSame$default(KAssert kAssert, Object obj, Object obj2, ds.a aVar, int i10, Object obj3) {
        if ((i10 & 4) != 0) {
            aVar = C48581.INSTANCE;
        }
        if (Assert.isEnabled()) {
            Assert.assertSame((String) aVar.invoke(), obj, obj2);
        }
    }

    public static /* synthetic */ void assertTrue$default(KAssert kAssert, boolean z10, ds.a aVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            aVar = C48591.INSTANCE;
        }
        if (!Assert.isEnabled() || z10) {
            return;
        }
        Assert.fail((String) aVar.invoke());
    }

    public static /* synthetic */ void fail$default(KAssert kAssert, Throwable th2, ds.a aVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            aVar = C48611.INSTANCE;
        }
        if (Assert.isEnabled()) {
            Assert.fail((String) aVar.invoke(), th2);
        }
    }

    public final void assertEquals(@m Object obj, @m Object obj2, @l ds.a<String> aVar) {
        if (Assert.isEnabled()) {
            Assert.assertEquals(aVar.invoke(), obj, obj2);
        }
    }

    public final void assertFalse(boolean z10, @l ds.a<String> aVar) {
        if (Assert.isEnabled() && z10) {
            Assert.fail(aVar.invoke());
        }
    }

    public final void assertMainThread() {
        if (Assert.isEnabled()) {
            Assert.assertMainThread();
        }
    }

    public final void assertNotMainThread() {
        if (Assert.isEnabled()) {
            Assert.assertNotMainThread();
        }
    }

    public final void assertNotNull(@m Object obj, @l ds.a<String> aVar) {
        if (Assert.isEnabled() && obj == null) {
            Assert.fail(aVar.invoke());
        }
    }

    public final void assertNotSame(@m Object obj, @m Object obj2, @l ds.a<String> aVar) {
        if (Assert.isEnabled()) {
            Assert.assertNotSame(aVar.invoke(), obj, obj2);
        }
    }

    public final void assertNull(@m Object obj, @l ds.a<String> aVar) {
        if (!Assert.isEnabled() || obj == null) {
            return;
        }
        Assert.fail(aVar.invoke());
    }

    public final void assertSame(@m Object obj, @m Object obj2, @l ds.a<String> aVar) {
        if (Assert.isEnabled()) {
            Assert.assertSame(aVar.invoke(), obj, obj2);
        }
    }

    public final void assertTrue(boolean z10, @l ds.a<String> aVar) {
        if (!Assert.isEnabled() || z10) {
            return;
        }
        Assert.fail(aVar.invoke());
    }

    public final void fail(@l ds.a<String> aVar) {
        if (Assert.isEnabled()) {
            Assert.fail(aVar.invoke());
        }
    }

    public final void assertFalse(@l ds.a<Boolean> aVar, @l ds.a<String> aVar2) {
        if (Assert.isEnabled() && aVar.invoke().booleanValue()) {
            Assert.fail(aVar2.invoke());
        }
    }

    public final void assertTrue(@l ds.a<Boolean> aVar, @l ds.a<String> aVar2) {
        if (!Assert.isEnabled() || aVar.invoke().booleanValue()) {
            return;
        }
        Assert.fail(aVar2.invoke());
    }

    public final void fail(@m Throwable th2, @l ds.a<String> aVar) {
        if (Assert.isEnabled()) {
            Assert.fail(aVar.invoke(), th2);
        }
    }

    public static /* synthetic */ void assertFalse$default(KAssert kAssert, ds.a aVar, ds.a aVar2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            aVar2 = AnonymousClass2.INSTANCE;
        }
        if (Assert.isEnabled() && ((Boolean) aVar.invoke()).booleanValue()) {
            Assert.fail((String) aVar2.invoke());
        }
    }

    public static /* synthetic */ void assertTrue$default(KAssert kAssert, ds.a aVar, ds.a aVar2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            aVar2 = C48602.INSTANCE;
        }
        if (!Assert.isEnabled() || ((Boolean) aVar.invoke()).booleanValue()) {
            return;
        }
        Assert.fail((String) aVar2.invoke());
    }
}
