# QA Cohort Programme

Course materials for a 12-week, fully online QA training cohort — 2 sessions per week, 60 minutes each. The programme takes learners from zero testing experience to job-ready manual and automation QA skills, using plain language and South African context throughout.

This repo is the single home for facilitator guides, student guides, slide decks, and templates as the course is built out week by week.

## Status

The course is being built incrementally. This table tracks what currently exists — update it as new weeks are added.

| Week | Day | Topic | Facilitator Guide | Slides | Student Guide |
|------|-----|-------|:---:|:---:|:---:|
| 1 | 2 | Exploratory testing lab (Sauce Demo) | ✅ | — | — |
| 2 | 1 | Types of Testing (Functional vs Non-Functional, Black Box vs White Box) | ✅ | ✅ | ✅ (combined, see below) |
| 2 | 2 | Writing Your First Test Case | ✅ | — | ✅ (combined, see below) |

Week 1, Day 1 predates this repo and isn't captured yet — add it under `week-01/day-1/` when available.

## Repo Structure

```
qa-cohort-programme/
├── week-01/
│   └── day-2/                  Facilitator guide for that session
├── week-02/
│   ├── day-1/                  Facilitator guide + slide deck
│   ├── day-2/                  Facilitator guide
│   └── Week2_Student_Guide.docx    One combined student-facing guide for the whole week
├── templates/                  Reusable templates (test case template, BRD template, etc.)
├── docs/                       Course-wide reference docs (roadmap, naming conventions)
└── archive/                    Superseded drafts, kept for history — not current material
```

**Convention going forward:** each week gets its own `week-NN/` folder. Facilitator-only material (scripted guides, slide decks) lives in `day-N/` subfolders. Student-facing material that covers the whole week (like a combined student guide) sits directly under the week folder, not inside a specific day.

## Naming Conventions

- Folders: lowercase, hyphenated — `week-02`, `day-1`
- Files: `WeekN_DayN_<DocumentType>.docx` for day-specific material, e.g. `Week2_Day1_Facilitator_Guide.docx`
- Week-wide student material: `WeekN_Student_Guide.docx`
- Slide decks: `WeekN_DayN_Facilitator_Slides.pptx`

## Document Types
- **Facilitator Slides** — the deck to project live alongside the facilitator guide.
- **Student Guide** — the learner-facing reference: definitions, examples, and (from Week 2 onward) an Interview Prep section tied to that week's content.

## A Note on `archive/`

Files in `archive/` are earlier drafts that have since been superseded by a combined document (for example, `Week2_Key_QA_Terms_Reference_Handout_SUPERSEDED.docx` was folded into `Week2_Student_Guide.docx`). They're kept for history only — always use the current file in the week folder, not anything in `archive/`.

## Contributing / Updating

This is currently maintained by the course facilitator team. When adding a new week:

1. Create `week-NN/day-1/` and `week-NN/day-2/` folders
2. Add the facilitator guide(s) and slide deck(s) for each day
3. Add or update the week's Student Guide
4. Update the status table above
