package defpackage;

/* JADX INFO: loaded from: classes6.dex */
public abstract class go00 {

    @ae80
    public static final class a extends go00 {
        public static final a INSTANCE = new a();
        public static final /* synthetic */ ttr<php<Object>> a = hwr.a(a1s.b, new fo00());

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 212354931;
        }

        public final php<a> serializer() {
            return (php) a.getValue();
        }

        public final String toString() {
            return "KnowMoreAboutUniqueCodesScreen";
        }
    }

    @ae80
    public static final class b extends go00 {
        public static final b INSTANCE = new b();
        public static final /* synthetic */ ttr<php<Object>> a = hwr.a(a1s.b, new ho00(0));

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 958655499;
        }

        public final php<b> serializer() {
            return (php) a.getValue();
        }

        public final String toString() {
            return "PersonalScreen";
        }
    }

    @ae80
    public static final class c extends go00 {
        public static final c INSTANCE = new c();
        public static final /* synthetic */ ttr<php<Object>> a = hwr.a(a1s.b, new io00());

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return 1429774551;
        }

        public final php<c> serializer() {
            return (php) a.getValue();
        }

        public final String toString() {
            return "WhatIsUniqueCodeScreen";
        }
    }
}
