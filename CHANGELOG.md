# Changelog

All notable changes to this project are documented in this file.

---

## [0.1.1]

### Added
- New `HorizonCrossingLunarState` state to represent edge cases where moonset and moonrise coincide chronologically.
- Two new unit tests for lunar event.
- Initial version of this `CHANGELOG.md`.

### Changed
Improved accuracy of Moon illumination percentage calculation. Now uses a smoothed cosine approximation with daily averaging to reduce artifacts near phase boundaries.

### Fixed
Bug in solar horizon crossing detection (Logic handling `SET` followed by `RISE` events corrected to properly return `SET_AND_RISEN`).

---

## [0.1.0]

### Added
- Initial public release of **CelestialNavigationEvents**.
- Core functionality for calculating Sun and Moon astronomical events:
  - Sunrise and sunset times.
  - Moonrise and moonset times.
  - Lunar age (in days) and illumination percentage.
  - Start and end times of:
    - Civil, nautical, and astronomical twilight.
    - Magic hour and blue hour.
- State detection of:
  - Polar day and polar night.
  - Meridian and anti-meridian crossings.
  - Daylight, night, magic hour, blue hour, and all twilight phases.
- Offline computation based on geographic coordinates and `ZonedDateTime`.
- Modular Kotlin DSL API with separate calculators for solar and lunar events.
- Unit tests.