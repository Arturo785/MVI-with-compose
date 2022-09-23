package com.plcoding.weatherapp.domain.weather;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \f2\u00020\u0001:\u001c\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&B\u0019\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u0082\u0001\u001b\'()*+,-./0123456789:;<=>?@A\u00a8\u0006B"}, d2 = {"Lcom/plcoding/weatherapp/domain/weather/WeatherType;", "", "weatherDesc", "", "iconRes", "", "(Ljava/lang/String;I)V", "getIconRes", "()I", "getWeatherDesc", "()Ljava/lang/String;", "ClearSky", "Companion", "DenseDrizzle", "DenseFreezingDrizzle", "DepositingRimeFog", "Foggy", "HeavyFreezingRain", "HeavyHailThunderstorm", "HeavyRain", "HeavySnowFall", "HeavySnowShowers", "LightDrizzle", "LightFreezingDrizzle", "MainlyClear", "ModerateDrizzle", "ModerateRain", "ModerateRainShowers", "ModerateSnowFall", "ModerateThunderstorm", "Overcast", "PartlyCloudy", "SlightHailThunderstorm", "SlightRain", "SlightRainShowers", "SlightSnowFall", "SlightSnowShowers", "SnowGrains", "ViolentRainShowers", "Lcom/plcoding/weatherapp/domain/weather/WeatherType$ClearSky;", "Lcom/plcoding/weatherapp/domain/weather/WeatherType$MainlyClear;", "Lcom/plcoding/weatherapp/domain/weather/WeatherType$PartlyCloudy;", "Lcom/plcoding/weatherapp/domain/weather/WeatherType$Overcast;", "Lcom/plcoding/weatherapp/domain/weather/WeatherType$Foggy;", "Lcom/plcoding/weatherapp/domain/weather/WeatherType$DepositingRimeFog;", "Lcom/plcoding/weatherapp/domain/weather/WeatherType$LightDrizzle;", "Lcom/plcoding/weatherapp/domain/weather/WeatherType$ModerateDrizzle;", "Lcom/plcoding/weatherapp/domain/weather/WeatherType$DenseDrizzle;", "Lcom/plcoding/weatherapp/domain/weather/WeatherType$LightFreezingDrizzle;", "Lcom/plcoding/weatherapp/domain/weather/WeatherType$DenseFreezingDrizzle;", "Lcom/plcoding/weatherapp/domain/weather/WeatherType$SlightRain;", "Lcom/plcoding/weatherapp/domain/weather/WeatherType$ModerateRain;", "Lcom/plcoding/weatherapp/domain/weather/WeatherType$HeavyRain;", "Lcom/plcoding/weatherapp/domain/weather/WeatherType$HeavyFreezingRain;", "Lcom/plcoding/weatherapp/domain/weather/WeatherType$SlightSnowFall;", "Lcom/plcoding/weatherapp/domain/weather/WeatherType$ModerateSnowFall;", "Lcom/plcoding/weatherapp/domain/weather/WeatherType$HeavySnowFall;", "Lcom/plcoding/weatherapp/domain/weather/WeatherType$SnowGrains;", "Lcom/plcoding/weatherapp/domain/weather/WeatherType$SlightRainShowers;", "Lcom/plcoding/weatherapp/domain/weather/WeatherType$ModerateRainShowers;", "Lcom/plcoding/weatherapp/domain/weather/WeatherType$ViolentRainShowers;", "Lcom/plcoding/weatherapp/domain/weather/WeatherType$SlightSnowShowers;", "Lcom/plcoding/weatherapp/domain/weather/WeatherType$HeavySnowShowers;", "Lcom/plcoding/weatherapp/domain/weather/WeatherType$ModerateThunderstorm;", "Lcom/plcoding/weatherapp/domain/weather/WeatherType$SlightHailThunderstorm;", "Lcom/plcoding/weatherapp/domain/weather/WeatherType$HeavyHailThunderstorm;", "app_debug"})
public abstract class WeatherType {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String weatherDesc = null;
    private final int iconRes = 0;
    @org.jetbrains.annotations.NotNull()
    public static final com.plcoding.weatherapp.domain.weather.WeatherType.Companion Companion = null;
    
    private WeatherType(java.lang.String weatherDesc, @androidx.annotation.DrawableRes()
    int iconRes) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getWeatherDesc() {
        return null;
    }
    
    public final int getIconRes() {
        return 0;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/plcoding/weatherapp/domain/weather/WeatherType$ClearSky;", "Lcom/plcoding/weatherapp/domain/weather/WeatherType;", "()V", "app_debug"})
    public static final class ClearSky extends com.plcoding.weatherapp.domain.weather.WeatherType {
        @org.jetbrains.annotations.NotNull()
        public static final com.plcoding.weatherapp.domain.weather.WeatherType.ClearSky INSTANCE = null;
        
        private ClearSky() {
            super(null, 0);
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/plcoding/weatherapp/domain/weather/WeatherType$MainlyClear;", "Lcom/plcoding/weatherapp/domain/weather/WeatherType;", "()V", "app_debug"})
    public static final class MainlyClear extends com.plcoding.weatherapp.domain.weather.WeatherType {
        @org.jetbrains.annotations.NotNull()
        public static final com.plcoding.weatherapp.domain.weather.WeatherType.MainlyClear INSTANCE = null;
        
        private MainlyClear() {
            super(null, 0);
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/plcoding/weatherapp/domain/weather/WeatherType$PartlyCloudy;", "Lcom/plcoding/weatherapp/domain/weather/WeatherType;", "()V", "app_debug"})
    public static final class PartlyCloudy extends com.plcoding.weatherapp.domain.weather.WeatherType {
        @org.jetbrains.annotations.NotNull()
        public static final com.plcoding.weatherapp.domain.weather.WeatherType.PartlyCloudy INSTANCE = null;
        
        private PartlyCloudy() {
            super(null, 0);
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/plcoding/weatherapp/domain/weather/WeatherType$Overcast;", "Lcom/plcoding/weatherapp/domain/weather/WeatherType;", "()V", "app_debug"})
    public static final class Overcast extends com.plcoding.weatherapp.domain.weather.WeatherType {
        @org.jetbrains.annotations.NotNull()
        public static final com.plcoding.weatherapp.domain.weather.WeatherType.Overcast INSTANCE = null;
        
        private Overcast() {
            super(null, 0);
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/plcoding/weatherapp/domain/weather/WeatherType$Foggy;", "Lcom/plcoding/weatherapp/domain/weather/WeatherType;", "()V", "app_debug"})
    public static final class Foggy extends com.plcoding.weatherapp.domain.weather.WeatherType {
        @org.jetbrains.annotations.NotNull()
        public static final com.plcoding.weatherapp.domain.weather.WeatherType.Foggy INSTANCE = null;
        
        private Foggy() {
            super(null, 0);
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/plcoding/weatherapp/domain/weather/WeatherType$DepositingRimeFog;", "Lcom/plcoding/weatherapp/domain/weather/WeatherType;", "()V", "app_debug"})
    public static final class DepositingRimeFog extends com.plcoding.weatherapp.domain.weather.WeatherType {
        @org.jetbrains.annotations.NotNull()
        public static final com.plcoding.weatherapp.domain.weather.WeatherType.DepositingRimeFog INSTANCE = null;
        
        private DepositingRimeFog() {
            super(null, 0);
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/plcoding/weatherapp/domain/weather/WeatherType$LightDrizzle;", "Lcom/plcoding/weatherapp/domain/weather/WeatherType;", "()V", "app_debug"})
    public static final class LightDrizzle extends com.plcoding.weatherapp.domain.weather.WeatherType {
        @org.jetbrains.annotations.NotNull()
        public static final com.plcoding.weatherapp.domain.weather.WeatherType.LightDrizzle INSTANCE = null;
        
        private LightDrizzle() {
            super(null, 0);
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/plcoding/weatherapp/domain/weather/WeatherType$ModerateDrizzle;", "Lcom/plcoding/weatherapp/domain/weather/WeatherType;", "()V", "app_debug"})
    public static final class ModerateDrizzle extends com.plcoding.weatherapp.domain.weather.WeatherType {
        @org.jetbrains.annotations.NotNull()
        public static final com.plcoding.weatherapp.domain.weather.WeatherType.ModerateDrizzle INSTANCE = null;
        
        private ModerateDrizzle() {
            super(null, 0);
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/plcoding/weatherapp/domain/weather/WeatherType$DenseDrizzle;", "Lcom/plcoding/weatherapp/domain/weather/WeatherType;", "()V", "app_debug"})
    public static final class DenseDrizzle extends com.plcoding.weatherapp.domain.weather.WeatherType {
        @org.jetbrains.annotations.NotNull()
        public static final com.plcoding.weatherapp.domain.weather.WeatherType.DenseDrizzle INSTANCE = null;
        
        private DenseDrizzle() {
            super(null, 0);
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/plcoding/weatherapp/domain/weather/WeatherType$LightFreezingDrizzle;", "Lcom/plcoding/weatherapp/domain/weather/WeatherType;", "()V", "app_debug"})
    public static final class LightFreezingDrizzle extends com.plcoding.weatherapp.domain.weather.WeatherType {
        @org.jetbrains.annotations.NotNull()
        public static final com.plcoding.weatherapp.domain.weather.WeatherType.LightFreezingDrizzle INSTANCE = null;
        
        private LightFreezingDrizzle() {
            super(null, 0);
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/plcoding/weatherapp/domain/weather/WeatherType$DenseFreezingDrizzle;", "Lcom/plcoding/weatherapp/domain/weather/WeatherType;", "()V", "app_debug"})
    public static final class DenseFreezingDrizzle extends com.plcoding.weatherapp.domain.weather.WeatherType {
        @org.jetbrains.annotations.NotNull()
        public static final com.plcoding.weatherapp.domain.weather.WeatherType.DenseFreezingDrizzle INSTANCE = null;
        
        private DenseFreezingDrizzle() {
            super(null, 0);
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/plcoding/weatherapp/domain/weather/WeatherType$SlightRain;", "Lcom/plcoding/weatherapp/domain/weather/WeatherType;", "()V", "app_debug"})
    public static final class SlightRain extends com.plcoding.weatherapp.domain.weather.WeatherType {
        @org.jetbrains.annotations.NotNull()
        public static final com.plcoding.weatherapp.domain.weather.WeatherType.SlightRain INSTANCE = null;
        
        private SlightRain() {
            super(null, 0);
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/plcoding/weatherapp/domain/weather/WeatherType$ModerateRain;", "Lcom/plcoding/weatherapp/domain/weather/WeatherType;", "()V", "app_debug"})
    public static final class ModerateRain extends com.plcoding.weatherapp.domain.weather.WeatherType {
        @org.jetbrains.annotations.NotNull()
        public static final com.plcoding.weatherapp.domain.weather.WeatherType.ModerateRain INSTANCE = null;
        
        private ModerateRain() {
            super(null, 0);
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/plcoding/weatherapp/domain/weather/WeatherType$HeavyRain;", "Lcom/plcoding/weatherapp/domain/weather/WeatherType;", "()V", "app_debug"})
    public static final class HeavyRain extends com.plcoding.weatherapp.domain.weather.WeatherType {
        @org.jetbrains.annotations.NotNull()
        public static final com.plcoding.weatherapp.domain.weather.WeatherType.HeavyRain INSTANCE = null;
        
        private HeavyRain() {
            super(null, 0);
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/plcoding/weatherapp/domain/weather/WeatherType$HeavyFreezingRain;", "Lcom/plcoding/weatherapp/domain/weather/WeatherType;", "()V", "app_debug"})
    public static final class HeavyFreezingRain extends com.plcoding.weatherapp.domain.weather.WeatherType {
        @org.jetbrains.annotations.NotNull()
        public static final com.plcoding.weatherapp.domain.weather.WeatherType.HeavyFreezingRain INSTANCE = null;
        
        private HeavyFreezingRain() {
            super(null, 0);
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/plcoding/weatherapp/domain/weather/WeatherType$SlightSnowFall;", "Lcom/plcoding/weatherapp/domain/weather/WeatherType;", "()V", "app_debug"})
    public static final class SlightSnowFall extends com.plcoding.weatherapp.domain.weather.WeatherType {
        @org.jetbrains.annotations.NotNull()
        public static final com.plcoding.weatherapp.domain.weather.WeatherType.SlightSnowFall INSTANCE = null;
        
        private SlightSnowFall() {
            super(null, 0);
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/plcoding/weatherapp/domain/weather/WeatherType$ModerateSnowFall;", "Lcom/plcoding/weatherapp/domain/weather/WeatherType;", "()V", "app_debug"})
    public static final class ModerateSnowFall extends com.plcoding.weatherapp.domain.weather.WeatherType {
        @org.jetbrains.annotations.NotNull()
        public static final com.plcoding.weatherapp.domain.weather.WeatherType.ModerateSnowFall INSTANCE = null;
        
        private ModerateSnowFall() {
            super(null, 0);
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/plcoding/weatherapp/domain/weather/WeatherType$HeavySnowFall;", "Lcom/plcoding/weatherapp/domain/weather/WeatherType;", "()V", "app_debug"})
    public static final class HeavySnowFall extends com.plcoding.weatherapp.domain.weather.WeatherType {
        @org.jetbrains.annotations.NotNull()
        public static final com.plcoding.weatherapp.domain.weather.WeatherType.HeavySnowFall INSTANCE = null;
        
        private HeavySnowFall() {
            super(null, 0);
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/plcoding/weatherapp/domain/weather/WeatherType$SnowGrains;", "Lcom/plcoding/weatherapp/domain/weather/WeatherType;", "()V", "app_debug"})
    public static final class SnowGrains extends com.plcoding.weatherapp.domain.weather.WeatherType {
        @org.jetbrains.annotations.NotNull()
        public static final com.plcoding.weatherapp.domain.weather.WeatherType.SnowGrains INSTANCE = null;
        
        private SnowGrains() {
            super(null, 0);
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/plcoding/weatherapp/domain/weather/WeatherType$SlightRainShowers;", "Lcom/plcoding/weatherapp/domain/weather/WeatherType;", "()V", "app_debug"})
    public static final class SlightRainShowers extends com.plcoding.weatherapp.domain.weather.WeatherType {
        @org.jetbrains.annotations.NotNull()
        public static final com.plcoding.weatherapp.domain.weather.WeatherType.SlightRainShowers INSTANCE = null;
        
        private SlightRainShowers() {
            super(null, 0);
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/plcoding/weatherapp/domain/weather/WeatherType$ModerateRainShowers;", "Lcom/plcoding/weatherapp/domain/weather/WeatherType;", "()V", "app_debug"})
    public static final class ModerateRainShowers extends com.plcoding.weatherapp.domain.weather.WeatherType {
        @org.jetbrains.annotations.NotNull()
        public static final com.plcoding.weatherapp.domain.weather.WeatherType.ModerateRainShowers INSTANCE = null;
        
        private ModerateRainShowers() {
            super(null, 0);
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/plcoding/weatherapp/domain/weather/WeatherType$ViolentRainShowers;", "Lcom/plcoding/weatherapp/domain/weather/WeatherType;", "()V", "app_debug"})
    public static final class ViolentRainShowers extends com.plcoding.weatherapp.domain.weather.WeatherType {
        @org.jetbrains.annotations.NotNull()
        public static final com.plcoding.weatherapp.domain.weather.WeatherType.ViolentRainShowers INSTANCE = null;
        
        private ViolentRainShowers() {
            super(null, 0);
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/plcoding/weatherapp/domain/weather/WeatherType$SlightSnowShowers;", "Lcom/plcoding/weatherapp/domain/weather/WeatherType;", "()V", "app_debug"})
    public static final class SlightSnowShowers extends com.plcoding.weatherapp.domain.weather.WeatherType {
        @org.jetbrains.annotations.NotNull()
        public static final com.plcoding.weatherapp.domain.weather.WeatherType.SlightSnowShowers INSTANCE = null;
        
        private SlightSnowShowers() {
            super(null, 0);
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/plcoding/weatherapp/domain/weather/WeatherType$HeavySnowShowers;", "Lcom/plcoding/weatherapp/domain/weather/WeatherType;", "()V", "app_debug"})
    public static final class HeavySnowShowers extends com.plcoding.weatherapp.domain.weather.WeatherType {
        @org.jetbrains.annotations.NotNull()
        public static final com.plcoding.weatherapp.domain.weather.WeatherType.HeavySnowShowers INSTANCE = null;
        
        private HeavySnowShowers() {
            super(null, 0);
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/plcoding/weatherapp/domain/weather/WeatherType$ModerateThunderstorm;", "Lcom/plcoding/weatherapp/domain/weather/WeatherType;", "()V", "app_debug"})
    public static final class ModerateThunderstorm extends com.plcoding.weatherapp.domain.weather.WeatherType {
        @org.jetbrains.annotations.NotNull()
        public static final com.plcoding.weatherapp.domain.weather.WeatherType.ModerateThunderstorm INSTANCE = null;
        
        private ModerateThunderstorm() {
            super(null, 0);
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/plcoding/weatherapp/domain/weather/WeatherType$SlightHailThunderstorm;", "Lcom/plcoding/weatherapp/domain/weather/WeatherType;", "()V", "app_debug"})
    public static final class SlightHailThunderstorm extends com.plcoding.weatherapp.domain.weather.WeatherType {
        @org.jetbrains.annotations.NotNull()
        public static final com.plcoding.weatherapp.domain.weather.WeatherType.SlightHailThunderstorm INSTANCE = null;
        
        private SlightHailThunderstorm() {
            super(null, 0);
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/plcoding/weatherapp/domain/weather/WeatherType$HeavyHailThunderstorm;", "Lcom/plcoding/weatherapp/domain/weather/WeatherType;", "()V", "app_debug"})
    public static final class HeavyHailThunderstorm extends com.plcoding.weatherapp.domain.weather.WeatherType {
        @org.jetbrains.annotations.NotNull()
        public static final com.plcoding.weatherapp.domain.weather.WeatherType.HeavyHailThunderstorm INSTANCE = null;
        
        private HeavyHailThunderstorm() {
            super(null, 0);
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/plcoding/weatherapp/domain/weather/WeatherType$Companion;", "", "()V", "fromWMO", "Lcom/plcoding/weatherapp/domain/weather/WeatherType;", "code", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.plcoding.weatherapp.domain.weather.WeatherType fromWMO(int code) {
            return null;
        }
    }
}