package com.unity3d.ironsourceads.internal.services;

import android.content.Context;
import com.ironsource.C4365k9;
import com.ironsource.EnumC4401m9;
import gi.j;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.x;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public interface a {

    /* JADX INFO: renamed from: com.unity3d.ironsourceads.internal.services.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static abstract class AbstractC0739a {

        /* JADX INFO: renamed from: com.unity3d.ironsourceads.internal.services.a$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public static final class C0740a extends AbstractC0739a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @l
            private final String f76236a;

            /* JADX WARN: Multi-variable type inference failed */
            public C0740a() {
                this(null, 1, 0 == true ? 1 : 0);
            }

            @l
            public final String a() {
                return this.f76236a;
            }

            @l
            public final String b() {
                return this.f76236a;
            }

            public boolean equals(@m Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C0740a) && m0.g(this.f76236a, ((C0740a) obj).f76236a);
            }

            public int hashCode() {
                return this.f76236a.hashCode();
            }

            @l
            public String toString() {
                return "Error(errorMessage=" + this.f76236a + j.f86771d;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0740a(@l String errorMessage) {
                super(null);
                m0.p(errorMessage, "errorMessage");
                this.f76236a = errorMessage;
            }

            @l
            public final C0740a a(@l String errorMessage) {
                m0.p(errorMessage, "errorMessage");
                return new C0740a(errorMessage);
            }

            public /* synthetic */ C0740a(String str, int i10, x xVar) {
                this((i10 & 1) != 0 ? "" : str);
            }

            public static /* synthetic */ C0740a a(C0740a c0740a, String str, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = c0740a.f76236a;
                }
                return c0740a.a(str);
            }
        }

        /* JADX INFO: renamed from: com.unity3d.ironsourceads.internal.services.a$a$b */
        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public static final class b extends AbstractC0739a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @l
            public static final b f76237a = new b();

            private b() {
                super(null);
            }
        }

        public /* synthetic */ AbstractC0739a(x xVar) {
            this();
        }

        private AbstractC0739a() {
        }
    }

    @l
    AbstractC0739a a(@l Context context, @l C4365k9 c4365k9);

    @l
    AbstractC0739a a(@l Context context, @l EnumC4401m9 enumC4401m9);
}
